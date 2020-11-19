package typingsSlinky.officeJs.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EntityType extends js.Object
/**
  * Specifies an entity's type.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.EntityType")
@js.native
object EntityType extends js.Object {
  
  /**
    * Specifies that the entity is a postal address.
    */
  @js.native
  sealed trait Address extends EntityType
  
  /**
    * Specifies that the entity is a contact.
    */
  @js.native
  sealed trait Contact extends EntityType
  
  /**
    * Specifies that the entity is an SMTP email address.
    */
  @js.native
  sealed trait EmailAddress extends EntityType
  
  /**
    * Specifies that the entity is a meeting suggestion.
    */
  @js.native
  sealed trait MeetingSuggestion extends EntityType
  
  /**
    * Specifies that the entity is a US phone number.
    */
  @js.native
  sealed trait PhoneNumber extends EntityType
  
  /**
    * Specifies that the entity is a task suggestion.
    */
  @js.native
  sealed trait TaskSuggestion extends EntityType
  
  /**
    * Specifies that the entity is an Internet URL.
    */
  @js.native
  sealed trait Url extends EntityType
}
