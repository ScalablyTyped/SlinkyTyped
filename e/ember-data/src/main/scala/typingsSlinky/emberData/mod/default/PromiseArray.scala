package typingsSlinky.emberData.mod.default

import typingsSlinky.ember.mod.default.ArrayProxy
import typingsSlinky.emberObject.promiseProxyMixinMod.PromiseProxyMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember-data", "PromiseArray")
@js.native
class PromiseArray[T] ()
  extends PromiseProxyMixin[ArrayProxy[T]]
     with typingsSlinky.emberArray.proxyMod.ArrayProxy[T]
