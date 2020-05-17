package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMsoCharacters extends js.Object {
  val Application: js.Any = js.native
  var Caption: String = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Font: ChartFont = js.native
  @JSName("Office.IMsoCharacters_typekey")
  var OfficeDotIMsoCharacters_typekey: IMsoCharacters = js.native
  val Parent: js.Any = js.native
  var PhoneticCharacters: String = js.native
  var Text: String = js.native
  def Delete(): js.Any = js.native
  def Insert(bstr: String): js.Any = js.native
}

object IMsoCharacters {
  @scala.inline
  def apply(
    Application: js.Any,
    Caption: String,
    Count: Double,
    Creator: Double,
    Delete: () => js.Any,
    Font: ChartFont,
    Insert: String => js.Any,
    OfficeDotIMsoCharacters_typekey: IMsoCharacters,
    Parent: js.Any,
    PhoneticCharacters: String,
    Text: String
  ): IMsoCharacters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Insert = js.Any.fromFunction1(Insert), Parent = Parent.asInstanceOf[js.Any], PhoneticCharacters = PhoneticCharacters.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoCharacters_typekey")(OfficeDotIMsoCharacters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoCharacters]
  }
  @scala.inline
  implicit class IMsoCharactersOps[Self <: IMsoCharacters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFont(value: ChartFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsert(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOfficeDotIMsoCharacters_typekey(value: IMsoCharacters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.IMsoCharacters_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneticCharacters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneticCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

