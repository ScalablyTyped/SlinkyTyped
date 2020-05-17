package typingsSlinky.expressWinston.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function2[
/ * req * / typingsSlinky.express.mod.Request_[
  typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
  js.Any, 
  js.Any, 
  typingsSlinky.expressServeStaticCore.mod.Query
], 
/ * res * / typingsSlinky.express.mod.Response_[js.Any], 
java.lang.String]
*/
trait MessageTemplate extends js.Object

object MessageTemplate {
  @scala.inline
  implicit def apply(
    value: js.Function2[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* res */ Response_[js.Any], 
      String
    ]
  ): MessageTemplate = value.asInstanceOf[MessageTemplate]
  @scala.inline
  implicit def apply(value: String): MessageTemplate = value.asInstanceOf[MessageTemplate]
}

