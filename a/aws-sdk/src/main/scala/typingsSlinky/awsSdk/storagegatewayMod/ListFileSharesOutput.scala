package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFileSharesOutput extends js.Object {
  /**
    * An array of information about the file gateway's file shares. 
    */
  var FileShareInfoList: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareInfoList] = js.native
  /**
    * If the request includes Marker, the response returns that value in this field. 
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * If a value is present, there are more file shares to return. In a subsequent request, use NextMarker as the value for Marker to retrieve the next set of file shares. 
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object ListFileSharesOutput {
  @scala.inline
  def apply(): ListFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFileSharesOutput]
  }
  @scala.inline
  implicit class ListFileSharesOutputOps[Self <: ListFileSharesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileShareInfoList(value: FileShareInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileShareInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareInfoList")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(js.undefined)
        ret
    }
  }
  
}

