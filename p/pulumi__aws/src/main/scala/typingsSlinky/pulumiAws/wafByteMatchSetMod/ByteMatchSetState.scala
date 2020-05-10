package typingsSlinky.pulumiAws.wafByteMatchSetMod

import typingsSlinky.pulumiAws.inputMod.waf.ByteMatchSetByteMatchTuple
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteMatchSetState extends js.Object {
  /**
    * Specifies the bytes (typically a string that corresponds
    * with ASCII characters) that you want to search for in web requests,
    * the location in requests that you want to search, and other settings.
    */
  val byteMatchTuples: js.UndefOr[Input[js.Array[Input[ByteMatchSetByteMatchTuple]]]] = js.native
  /**
    * The name or description of the Byte Match Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object ByteMatchSetState {
  @scala.inline
  def apply(): ByteMatchSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteMatchSetState]
  }
  @scala.inline
  implicit class ByteMatchSetStateOps[Self <: ByteMatchSetState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteMatchTuples(value: Input[js.Array[Input[ByteMatchSetByteMatchTuple]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteMatchTuples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteMatchTuples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteMatchTuples")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

