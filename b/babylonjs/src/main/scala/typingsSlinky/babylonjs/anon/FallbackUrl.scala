package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FallbackUrl extends js.Object {
  /**
    * The url to the fallback JavaScript module.
    */
  var fallbackUrl: js.UndefOr[String] = js.native
  /**
    * The url to the WebAssembly binary.
    */
  var wasmBinaryUrl: js.UndefOr[String] = js.native
  /**
    * The url to the WebAssembly module.
    */
  var wasmUrl: js.UndefOr[String] = js.native
}

object FallbackUrl {
  @scala.inline
  def apply(): FallbackUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FallbackUrl]
  }
  @scala.inline
  implicit class FallbackUrlOps[Self <: FallbackUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFallbackUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withWasmBinaryUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasmBinaryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWasmBinaryUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasmBinaryUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withWasmUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasmUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWasmUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasmUrl")(js.undefined)
        ret
    }
  }
  
}

