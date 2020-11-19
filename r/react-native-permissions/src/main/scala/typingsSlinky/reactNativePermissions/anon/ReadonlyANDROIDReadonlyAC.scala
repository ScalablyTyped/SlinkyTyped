package typingsSlinky.reactNativePermissions.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  ANDROID :std.Readonly<{  ACCEPT_HANDOVER :'android.permission.ACCEPT_HANDOVER',   ACCESS_BACKGROUND_LOCATION :'android.permission.ACCESS_BACKGROUND_LOCATION',   ACCESS_COARSE_LOCATION :'android.permission.ACCESS_COARSE_LOCATION',   ACCESS_FINE_LOCATION :'android.permission.ACCESS_FINE_LOCATION',   ACTIVITY_RECOGNITION :'android.permission.ACTIVITY_RECOGNITION',   ADD_VOICEMAIL :'com.android.voicemail.permission.ADD_VOICEMAIL',   ANSWER_PHONE_CALLS :'android.permission.ANSWER_PHONE_CALLS',   BODY_SENSORS :'android.permission.BODY_SENSORS',   CALL_PHONE :'android.permission.CALL_PHONE',   CAMERA :'android.permission.CAMERA',   GET_ACCOUNTS :'android.permission.GET_ACCOUNTS',   PROCESS_OUTGOING_CALLS :'android.permission.PROCESS_OUTGOING_CALLS',   READ_CALENDAR :'android.permission.READ_CALENDAR',   READ_CALL_LOG :'android.permission.READ_CALL_LOG',   READ_CONTACTS :'android.permission.READ_CONTACTS',   READ_EXTERNAL_STORAGE :'android.permission.READ_EXTERNAL_STORAGE',   READ_PHONE_NUMBERS :'android.permission.READ_PHONE_NUMBERS',   READ_PHONE_STATE :'android.permission.READ_PHONE_STATE',   READ_SMS :'android.permission.READ_SMS',   RECEIVE_MMS :'android.permission.RECEIVE_MMS',   RECEIVE_SMS :'android.permission.RECEIVE_SMS',   RECEIVE_WAP_PUSH :'android.permission.RECEIVE_WAP_PUSH',   RECORD_AUDIO :'android.permission.RECORD_AUDIO',   SEND_SMS :'android.permission.SEND_SMS',   USE_SIP :'android.permission.USE_SIP',   WRITE_CALENDAR :'android.permission.WRITE_CALENDAR',   WRITE_CALL_LOG :'android.permission.WRITE_CALL_LOG',   WRITE_CONTACTS :'android.permission.WRITE_CONTACTS',   WRITE_EXTERNAL_STORAGE :'android.permission.WRITE_EXTERNAL_STORAGE'}>,   IOS :std.Readonly<{  BLUETOOTH_PERIPHERAL :'ios.permission.BLUETOOTH_PERIPHERAL',   CALENDARS :'ios.permission.CALENDARS',   CAMERA :'ios.permission.CAMERA',   CONTACTS :'ios.permission.CONTACTS',   FACE_ID :'ios.permission.FACE_ID',   LOCATION_ALWAYS :'ios.permission.LOCATION_ALWAYS',   LOCATION_WHEN_IN_USE :'ios.permission.LOCATION_WHEN_IN_USE',   MEDIA_LIBRARY :'ios.permission.MEDIA_LIBRARY',   MICROPHONE :'ios.permission.MICROPHONE',   MOTION :'ios.permission.MOTION',   PHOTO_LIBRARY :'ios.permission.PHOTO_LIBRARY',   REMINDERS :'ios.permission.REMINDERS',   SIRI :'ios.permission.SIRI',   SPEECH_RECOGNITION :'ios.permission.SPEECH_RECOGNITION',   STOREKIT :'ios.permission.STOREKIT'}>}> */
@js.native
trait ReadonlyANDROIDReadonlyAC extends js.Object {
  
  val ANDROID: ReadonlyACCEPTHANDOVERand = js.native
  
  val IOS: ReadonlyBLUETOOTHPERIPHER = js.native
}
object ReadonlyANDROIDReadonlyAC {
  
  @scala.inline
  def apply(ANDROID: ReadonlyACCEPTHANDOVERand, IOS: ReadonlyBLUETOOTHPERIPHER): ReadonlyANDROIDReadonlyAC = {
    val __obj = js.Dynamic.literal(ANDROID = ANDROID.asInstanceOf[js.Any], IOS = IOS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyANDROIDReadonlyAC]
  }
  
  @scala.inline
  implicit class ReadonlyANDROIDReadonlyACOps[Self <: ReadonlyANDROIDReadonlyAC] (val x: Self) extends AnyVal {
    
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
    def setANDROID(value: ReadonlyACCEPTHANDOVERand): Self = this.set("ANDROID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIOS(value: ReadonlyBLUETOOTHPERIPHER): Self = this.set("IOS", value.asInstanceOf[js.Any])
  }
}
