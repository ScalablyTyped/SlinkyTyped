package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hierarchy extends js.Object {
  
  /**
    * Returns the unique name of the 'All' member for the hierarchy.
    *
    * @param value
    */
  def allMember(value: js.Object): String = js.native
  
  /**
    * Returns the caption of the hierarchy used when displaying the name of the hierarchy to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String = js.native
  
  /**
    * Returns the unique name of the default member for the hierarchy.
    *
    * @param value
    */
  def defaultMember(value: js.Object): String = js.native
  
  /**
    * Returns a user-friendly description of the hierarchy.
    *
    * @param value
    */
  def description(value: js.Object): String = js.native
  
  /**
    * Returns the unique name of the dimension that contains the hierarchy.
    *
    * @param value
    */
  def dimensionUniqueName(value: js.Object): String = js.native
  
  /**
    * Returns the hierarchy display folder path to be used when displaying the hierarchy in the user interface.
    *             Folder names will be separated by a semicolon (;). Nested folders are indicated by a backslash (\).
    *
    * @param value
    */
  def hierarchyDisplayFolder(value: js.Object): String = js.native
  
  /**
    * Returns the source of the hierarchy which is a value from the $.ig.HierarchyOrigin enumeration.
    *
    *             $.ig.HierarchyOrigin.prototype.userDefined = 1;
    *             Identifies user defined hierarchies.
    *
    *             $.ig.HierarchyOrigin.prototype.systemEnabled = 2;
    *             Identifies attribute hierarchies.
    *
    *             $.ig.HierarchyOrigin.prototype.systemInternal = 4;
    *             Identifies attributes with no attribute .
    *
    * @param value
    */
  def hierarchyOrigin(value: js.Object): Double = js.native
  
  /**
    * Returns the name of the hierarchy.
    *
    * @param value
    */
  def name(value: js.Object): String = js.native
  
  /**
    * Returns the unique name of the hierarchy.
    *
    * @param value
    */
  def uniqueName(value: js.Object): String = js.native
}
object Hierarchy {
  
  @scala.inline
  def apply(
    allMember: js.Object => String,
    caption: js.Object => String,
    defaultMember: js.Object => String,
    description: js.Object => String,
    dimensionUniqueName: js.Object => String,
    hierarchyDisplayFolder: js.Object => String,
    hierarchyOrigin: js.Object => Double,
    name: js.Object => String,
    uniqueName: js.Object => String
  ): Hierarchy = {
    val __obj = js.Dynamic.literal(allMember = js.Any.fromFunction1(allMember), caption = js.Any.fromFunction1(caption), defaultMember = js.Any.fromFunction1(defaultMember), description = js.Any.fromFunction1(description), dimensionUniqueName = js.Any.fromFunction1(dimensionUniqueName), hierarchyDisplayFolder = js.Any.fromFunction1(hierarchyDisplayFolder), hierarchyOrigin = js.Any.fromFunction1(hierarchyOrigin), name = js.Any.fromFunction1(name), uniqueName = js.Any.fromFunction1(uniqueName))
    __obj.asInstanceOf[Hierarchy]
  }
  
  @scala.inline
  implicit class HierarchyOps[Self <: Hierarchy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllMember(value: js.Object => String): Self = this.set("allMember", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCaption(value: js.Object => String): Self = this.set("caption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultMember(value: js.Object => String): Self = this.set("defaultMember", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescription(value: js.Object => String): Self = this.set("description", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDimensionUniqueName(value: js.Object => String): Self = this.set("dimensionUniqueName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHierarchyDisplayFolder(value: js.Object => String): Self = this.set("hierarchyDisplayFolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHierarchyOrigin(value: js.Object => Double): Self = this.set("hierarchyOrigin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: js.Object => String): Self = this.set("name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUniqueName(value: js.Object => String): Self = this.set("uniqueName", js.Any.fromFunction1(value))
  }
}
