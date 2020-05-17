package typingsSlinky.registryAuthToken.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictregistryUrls
  extends /**
  * Registry url's with token information
  */
/* registryUrls */ StringDictionary[js.UndefOr[String]] {
  /**
    * A registry url used for matching
    */
  var registry: js.UndefOr[String] = js.native
}

object DictregistryUrls {
  @scala.inline
  def apply(): DictregistryUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictregistryUrls]
  }
  @scala.inline
  implicit class DictregistryUrlsOps[Self <: DictregistryUrls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(js.undefined)
        ret
    }
  }
  
}

