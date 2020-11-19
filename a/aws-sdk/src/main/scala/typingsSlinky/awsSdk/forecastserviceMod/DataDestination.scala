package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataDestination extends js.Object {
  
  /**
    * The path to an Amazon Simple Storage Service (Amazon S3) bucket along with the credentials to access the bucket.
    */
  var S3Config: typingsSlinky.awsSdk.forecastserviceMod.S3Config = js.native
}
object DataDestination {
  
  @scala.inline
  def apply(S3Config: S3Config): DataDestination = {
    val __obj = js.Dynamic.literal(S3Config = S3Config.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDestination]
  }
  
  @scala.inline
  implicit class DataDestinationOps[Self <: DataDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setS3Config(value: S3Config): Self = this.set("S3Config", value.asInstanceOf[js.Any])
  }
}
