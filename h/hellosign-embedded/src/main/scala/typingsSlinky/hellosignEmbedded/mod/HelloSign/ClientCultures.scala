package typingsSlinky.hellosignEmbedded.mod.HelloSign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCultures extends js.Object {
  /**
    * Danish (Denmark)
    *
    * @default da_DK
    */
  var DA_DK: String = js.native
  /**
    * German (Germany)
    *
    * @default de_DE
    */
  var DE_DE: String = js.native
  /**
    * English (United States)
    *
    * @default en_US
    */
  var EN_US: String = js.native
  /**
    * French (France)
    *
    * @default fr_FR
    */
  var FR_FR: String = js.native
  /**
    * Dutch (The Netherlands)
    * @default nl_NL
    */
  var NL_NL: String = js.native
  /**
    * Swedish (Sweden)
    *
    * @default sv_SE
    */
  var SV_SE: String = js.native
  /**
    * Chinese (China)
    *
    * @default zh_CN
    */
  var ZH_CN: String = js.native
  /**
    * The available client UI cultures
    */
  var supportedCultures: js.Array[String] = js.native
}

object ClientCultures {
  @scala.inline
  def apply(
    DA_DK: String,
    DE_DE: String,
    EN_US: String,
    FR_FR: String,
    NL_NL: String,
    SV_SE: String,
    ZH_CN: String,
    supportedCultures: js.Array[String]
  ): ClientCultures = {
    val __obj = js.Dynamic.literal(DA_DK = DA_DK.asInstanceOf[js.Any], DE_DE = DE_DE.asInstanceOf[js.Any], EN_US = EN_US.asInstanceOf[js.Any], FR_FR = FR_FR.asInstanceOf[js.Any], NL_NL = NL_NL.asInstanceOf[js.Any], SV_SE = SV_SE.asInstanceOf[js.Any], ZH_CN = ZH_CN.asInstanceOf[js.Any], supportedCultures = supportedCultures.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCultures]
  }
  @scala.inline
  implicit class ClientCulturesOps[Self <: ClientCultures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDA_DK(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DA_DK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDE_DE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DE_DE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEN_US(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EN_US")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFR_FR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FR_FR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNL_NL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NL_NL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSV_SE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SV_SE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZH_CN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZH_CN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedCultures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCultures")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

