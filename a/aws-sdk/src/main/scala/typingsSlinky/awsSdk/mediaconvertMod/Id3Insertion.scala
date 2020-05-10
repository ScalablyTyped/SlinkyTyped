package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id3Insertion extends js.Object {
  /**
    * Use ID3 tag (Id3) to provide a tag value in base64-encode format.
    */
  var Id3: js.UndefOr[stringPatternAZaZ0902] = js.native
  /**
    * Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
    */
  var Timecode: js.UndefOr[stringPattern010920405090509092] = js.native
}

object Id3Insertion {
  @scala.inline
  def apply(): Id3Insertion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id3Insertion]
  }
  @scala.inline
  implicit class Id3InsertionOps[Self <: Id3Insertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId3(value: stringPatternAZaZ0902): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id3")(js.undefined)
        ret
    }
    @scala.inline
    def withTimecode(value: stringPattern010920405090509092): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timecode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timecode")(js.undefined)
        ret
    }
  }
  
}

