package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A NotificationChannel is a medium through which an alert is delivered when
  * a policy violation is detected. Examples of channels include email, SMS,
  * and third-party messaging applications. Fields containing sensitive
  * information like authentication tokens or contact info are only partially
  * populated on retrieval.
  */
@js.native
trait SchemaNotificationChannel extends StObject {
  
  /**
    * An optional human-readable description of this notification channel. This
    * description may provide additional details, beyond the display name, for
    * the channel. This may not exceed 1024 Unicode characters.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * An optional human-readable name for this notification channel. It is
    * recommended that you specify a non-empty and unique name in order to make
    * it easier to identify the channels in your project, though this is not
    * enforced. The display name is limited to 512 Unicode characters.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Whether notifications are forwarded to the described channel. This makes
    * it possible to disable delivery of notifications to a particular channel
    * without removing the channel from all alerting policies that reference
    * the channel. This is a more convenient approach when the change is
    * temporary and you want to receive notifications from the same set of
    * alerting policies on the channel at some point in the future.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Configuration fields that define the channel and its behavior. The
    * permissible and required labels are specified in the
    * NotificationChannelDescriptor.labels of the NotificationChannelDescriptor
    * corresponding to the type field.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The full REST resource name for this channel. The syntax is:
    * projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID]
    * is automatically assigned by the server on creation.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of the notification channel. This field matches the value of the
    * NotificationChannelDescriptor.type field.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * User-supplied key/value data that does not need to conform to the
    * corresponding NotificationChannelDescriptor&#39;s schema, unlike the
    * labels field. This field is intended to be used for organizing and
    * identifying the NotificationChannel objects.The field can contain up to
    * 64 entries. Each key and value is limited to 63 Unicode characters or 128
    * bytes, whichever is smaller. Labels and values can contain only lowercase
    * letters, numerals, underscores, and dashes. Keys must begin with a
    * letter.
    */
  var userLabels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Indicates whether this channel has been verified or not. On a
    * ListNotificationChannels or GetNotificationChannel operation, this field
    * is expected to be populated.If the value is UNVERIFIED, then it indicates
    * that the channel is non-functioning (it both requires verification and
    * lacks verification); otherwise, it is assumed that the channel works.If
    * the channel is neither VERIFIED nor UNVERIFIED, it implies that the
    * channel is of a type that does not require verification or that this
    * specific channel has been exempted from verification because it was
    * created prior to verification being required for channels of this
    * type.This field cannot be modified using a standard
    * UpdateNotificationChannel operation. To change the value of this field,
    * you must call VerifyNotificationChannel.
    */
  var verificationStatus: js.UndefOr[String] = js.native
}
object SchemaNotificationChannel {
  
  @scala.inline
  def apply(): SchemaNotificationChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationChannel]
  }
  
  @scala.inline
  implicit class SchemaNotificationChannelMutableBuilder[Self <: SchemaNotificationChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUserLabels(value: StringDictionary[String]): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
    
    @scala.inline
    def setVerificationStatus(value: String): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
  }
}
