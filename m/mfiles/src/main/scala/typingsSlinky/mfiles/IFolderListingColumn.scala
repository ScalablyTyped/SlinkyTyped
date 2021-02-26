package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFFolderListingColumnFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFolderListingColumn extends StObject {
  
  def Clone(): IFolderListingColumn = js.native
  
  var Flags: MFFolderListingColumnFlags = js.native
  
  val ID: Double = js.native
  
  val Name: String = js.native
  
  var Position: Double = js.native
  
  var Visible: Boolean = js.native
  
  var Width: Double = js.native
}
object IFolderListingColumn {
  
  @scala.inline
  def apply(
    Clone: () => IFolderListingColumn,
    Flags: MFFolderListingColumnFlags,
    ID: Double,
    Name: String,
    Position: Double,
    Visible: Boolean,
    Width: Double
  ): IFolderListingColumn = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Flags = Flags.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderListingColumn]
  }
  
  @scala.inline
  implicit class IFolderListingColumnMutableBuilder[Self <: IFolderListingColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IFolderListingColumn): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlags(value: MFFolderListingColumnFlags): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
