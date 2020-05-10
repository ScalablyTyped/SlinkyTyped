package typingsSlinky.pizzip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadOptions extends js.Object {
  /**
    * set to true if the data is base64 encoded, false for binary.
    *
    * @default false
    */
  var base64: js.UndefOr[Boolean] = js.native
  /**
    * set to true if the read data should be checked against its CRC32.
    *
    * @default false
    */
  var checkCRC32: js.UndefOr[Boolean] = js.native
  /**
    * set to true to create folders in the file path automatically. Leaving it false will result in only virtual folders
    * (i.e. folders that merely represent part of the file path) being created.
    *
    * @default false
    */
  var createFolders: js.UndefOr[Boolean] = js.native
  /**
    * the function to decode the file name / comment. Decodes from UTF-8 by default.
    * A zip file has a flag to say if the filename and comment are encoded with UTF-8.
    * If it's not set, PizZip has no way to know the encoding used. It usually is the default encoding of the operating system.
    * The function takes the bytes array (Uint8Array or Array) and returns the decoded string.
    */
  var decodeFileName: js.UndefOr[js.Function1[/* bytes */ js.typedarray.Uint8Array | js.Array[Double], String]] = js.native
  /**
    * set to true if (and only if) the input is a string and has already been prepared with a 0xFF mask.
    *
    * @default false
    */
  var optimizedBinaryString: js.UndefOr[Boolean] = js.native
}

object LoadOptions {
  @scala.inline
  def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  @scala.inline
  implicit class LoadOptionsOps[Self <: LoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckCRC32(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCRC32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckCRC32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCRC32")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateFolders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFolders")(js.undefined)
        ret
    }
    @scala.inline
    def withDecodeFileName(value: /* bytes */ js.typedarray.Uint8Array | js.Array[Double] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeFileName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDecodeFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizedBinaryString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizedBinaryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizedBinaryString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizedBinaryString")(js.undefined)
        ret
    }
  }
  
}

