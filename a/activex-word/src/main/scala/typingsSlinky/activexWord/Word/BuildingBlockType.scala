package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: Categories): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotBuildingBlockType_typekey(value: BuildingBlockType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.BuildingBlockType_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

