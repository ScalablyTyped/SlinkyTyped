package typingsSlinky.awsSdkClientKinesisBrowser.typesStartingPositionMod

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AFTER_SEQUENCE_NUMBER
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_SEQUENCE_NUMBER
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_TIMESTAMP
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LATEST
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.TRIM_HORIZON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledStartingPosition extends StartingPosition {
  
  /**
    * _Timestamp shape
    */
  @JSName("Timestamp")
  var Timestamp_UnmarshalledStartingPosition: js.UndefOr[js.Date] = js.native
}
object UnmarshalledStartingPosition {
  
  @scala.inline
  def apply(Type: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String): UnmarshalledStartingPosition = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledStartingPosition]
  }
  
  @scala.inline
  implicit class UnmarshalledStartingPositionOps[Self <: UnmarshalledStartingPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
