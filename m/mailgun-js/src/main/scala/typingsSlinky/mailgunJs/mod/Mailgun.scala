package typingsSlinky.mailgunJs.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.mailgunJs.mailgunJsBooleans.`false`
import typingsSlinky.mailgunJs.mailgunJsBooleans.`true`
import typingsSlinky.mailgunJs.mod.validation.ParseResponse
import typingsSlinky.mailgunJs.mod.validation.ValidateResponse
import typingsSlinky.mailgunJs.mod.validation.ValidationCallback
import typingsSlinky.mailgunJs.mod.validation.ValidationOptionsPrivate
import typingsSlinky.mailgunJs.mod.validation.ValidationOptionsPublic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mailgun extends js.Object {
  
  var Attachment: Instantiable1[/* params */ AttachmentParams, typingsSlinky.mailgunJs.mod.Attachment] = js.native
  
  def delete(resource: String): js.Promise[_] = js.native
  def delete(resource: String, callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit = js.native
  def delete(resource: String, data: js.Any): js.Promise[_] = js.native
  def delete(
    resource: String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]
  ): Unit = js.native
  @JSName("delete")
  var delete_Original: MailgunRequest = js.native
  
  // Generic requests
  def get(resource: String): js.Promise[_] = js.native
  // Generic requests
  def get(resource: String, callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit = js.native
  def get(resource: String, data: js.Any): js.Promise[_] = js.native
  // Generic requests
  def get(
    resource: String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]
  ): Unit = js.native
  // Generic requests
  @JSName("get")
  var get_Original: MailgunRequest = js.native
  
  def lists(list: String): Lists_ = js.native
  
  def messages(): Messages_ = js.native
  
  def parse(addressList: js.Array[String]): js.Promise[ParseResponse] = js.native
  def parse(addressList: js.Array[String], callback: ValidationCallback): js.Promise[ParseResponse] = js.native
  
  def post(resource: String): js.Promise[_] = js.native
  def post(resource: String, callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit = js.native
  def post(resource: String, data: js.Any): js.Promise[_] = js.native
  def post(
    resource: String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]
  ): Unit = js.native
  @JSName("post")
  var post_Original: MailgunRequest = js.native
  
  def put(resource: String): js.Promise[_] = js.native
  def put(resource: String, callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit = js.native
  def put(resource: String, data: js.Any): js.Promise[_] = js.native
  def put(
    resource: String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]
  ): Unit = js.native
  @JSName("put")
  var put_Original: MailgunRequest = js.native
  
  def validate(address: String): js.Promise[ValidateResponse] = js.native
  def validate(address: String, callback: ValidationCallback): Unit = js.native
  // tslint:disable-next-line unified-signatures
  def validate(address: String, isPrivate: Boolean, callback: ValidationCallback): Unit = js.native
  def validate(address: String, opts: ValidationOptionsPublic): js.Promise[ValidateResponse] = js.native
  def validate(address: String, opts: ValidationOptionsPublic, callback: ValidationCallback): Unit = js.native
  
  def validateWebhook(bodyTimestamp: Double, bodyToken: String, bodySignature: String): Boolean = js.native
  
  @JSName("validate")
  def validate_false(address: String, isPrivate: `false`): js.Promise[ValidateResponse] = js.native
  @JSName("validate")
  def validate_false(address: String, isPrivate: `false`, opts: ValidationOptionsPublic): js.Promise[ValidateResponse] = js.native
  @JSName("validate")
  def validate_false(address: String, isPrivate: `false`, opts: ValidationOptionsPublic, callback: ValidationCallback): Unit = js.native
  @JSName("validate")
  def validate_true(address: String, isPrivate: `true`): js.Promise[ValidateResponse] = js.native
  @JSName("validate")
  def validate_true(address: String, isPrivate: `true`, opts: ValidationOptionsPrivate): js.Promise[ValidateResponse] = js.native
  @JSName("validate")
  def validate_true(address: String, isPrivate: `true`, opts: ValidationOptionsPrivate, callback: ValidationCallback): Unit = js.native
}
