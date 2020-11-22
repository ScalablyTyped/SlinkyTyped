package typingsSlinky.nextAuth.adaptersMod

import typingsSlinky.nextAuth.mod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-auth/adapters", "TypeORMUserModel")
@js.native
class TypeORMUserModel () extends User {
  def this(name: String) = this()
  def this(name: js.UndefOr[scala.Nothing], email: String) = this()
  def this(name: String, email: String) = this()
  def this(name: js.UndefOr[scala.Nothing], email: js.UndefOr[scala.Nothing], image: String) = this()
  def this(name: js.UndefOr[scala.Nothing], email: String, image: String) = this()
  def this(name: String, email: js.UndefOr[scala.Nothing], image: String) = this()
  def this(name: String, email: String, image: String) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    email: js.UndefOr[scala.Nothing],
    image: js.UndefOr[scala.Nothing],
    emailVerified: js.Date
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    email: js.UndefOr[scala.Nothing],
    image: String,
    emailVerified: js.Date
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    email: String,
    image: js.UndefOr[scala.Nothing],
    emailVerified: js.Date
  ) = this()
  def this(name: js.UndefOr[scala.Nothing], email: String, image: String, emailVerified: js.Date) = this()
  def this(
    name: String,
    email: js.UndefOr[scala.Nothing],
    image: js.UndefOr[scala.Nothing],
    emailVerified: js.Date
  ) = this()
  def this(name: String, email: js.UndefOr[scala.Nothing], image: String, emailVerified: js.Date) = this()
  def this(name: String, email: String, image: js.UndefOr[scala.Nothing], emailVerified: js.Date) = this()
  def this(name: String, email: String, image: String, emailVerified: js.Date) = this()
  
  var emailVerified: js.UndefOr[js.Date] = js.native
  
  @JSName("email")
  var email_TypeORMUserModel: js.UndefOr[String] = js.native
  
  @JSName("image")
  var image_TypeORMUserModel: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_TypeORMUserModel: js.UndefOr[String] = js.native
}
