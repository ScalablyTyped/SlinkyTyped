package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingBlockType extends js.Object {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Categories: typingsSlinky.activexWord.Word.Categories = js.native
  
  val Creator: Double = js.native
  
  val Index: Double = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.BuildingBlockType_typekey")
  var WordDotBuildingBlockType_typekey: BuildingBlockType = js.native
}
object BuildingBlockType {
  
  @scala.inline
  def apply(
    Application: Application,
    Categories: Categories,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotBuildingBlockType_typekey: BuildingBlockType
  ): BuildingBlockType = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Categories = Categories.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.BuildingBlockType_typekey")(WordDotBuildingBlockType_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingBlockType]
  }
  
  @scala.inline
  implicit class BuildingBlockTypeOps[Self <: BuildingBlockType] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategories(value: Categories): Self = this.set("Categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotBuildingBlockType_typekey(value: BuildingBlockType): Self = this.set("Word.BuildingBlockType_typekey", value.asInstanceOf[js.Any])
  }
}
