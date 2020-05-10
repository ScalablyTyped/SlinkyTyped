package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pings that the app shall fire (authenticated by biscotti cookie). Each ping
  * has a context, in which the app must fire the ping, and a url identifying
  * the ping.
  */
@js.native
trait SchemaChannelConversionPing extends js.Object {
  /**
    * Defines the context of the ping.
    */
  var context: js.UndefOr[String] = js.native
  /**
    * The url (without the schema) that the player shall send the ping to.
    * It&#39;s at caller&#39;s descretion to decide which schema to use (http
    * vs https) Example of a returned url:
    * //googleads.g.doubleclick.net/pagead/
    * viewthroughconversion/962985656/?data=path%3DtHe_path%3Btype%3D
    * cview%3Butuid%3DGISQtTNGYqaYl4sKxoVvKA&amp;labe=default The caller must
    * append biscotti authentication (ms param in case of mobile, for example)
    * to this ping.
    */
  var conversionUrl: js.UndefOr[String] = js.native
}

object SchemaChannelConversionPing {
  @scala.inline
  def apply(): SchemaChannelConversionPing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelConversionPing]
  }
  @scala.inline
  implicit class SchemaChannelConversionPingOps[Self <: SchemaChannelConversionPing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withConversionUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionUrl")(js.undefined)
        ret
    }
  }
  
}

