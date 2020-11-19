package typingsSlinky.apolloServerEnv

import typingsSlinky.apolloServerEnv.fetchMod.ReferrerPolicy
import typingsSlinky.apolloServerEnv.fetchMod.RequestCache
import typingsSlinky.apolloServerEnv.fetchMod.RequestCredentials
import typingsSlinky.apolloServerEnv.fetchMod.RequestMode
import typingsSlinky.apolloServerEnv.fetchMod.RequestRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apolloServerEnvStrings {
  
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @scala.inline
  def cors: cors = "cors".asInstanceOf[cors]
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def follow: follow = "follow".asInstanceOf[follow]
  
  @scala.inline
  def `force-cache`: `force-cache` = "force-cache".asInstanceOf[`force-cache`]
  
  @scala.inline
  def include: include = "include".asInstanceOf[include]
  
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  
  @scala.inline
  def navigate: navigate = "navigate".asInstanceOf[navigate]
  
  @scala.inline
  def `no-cache`: `no-cache` = "no-cache".asInstanceOf[`no-cache`]
  
  @scala.inline
  def `no-cors`: `no-cors` = "no-cors".asInstanceOf[`no-cors`]
  
  @scala.inline
  def `no-referrer`: `no-referrer` = "no-referrer".asInstanceOf[`no-referrer`]
  
  @scala.inline
  def `no-referrer-when-downgrade`: `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[`no-referrer-when-downgrade`]
  
  @scala.inline
  def `no-store`: `no-store` = "no-store".asInstanceOf[`no-store`]
  
  @scala.inline
  def omit: omit = "omit".asInstanceOf[omit]
  
  @scala.inline
  def `only-if-cached`: `only-if-cached` = "only-if-cached".asInstanceOf[`only-if-cached`]
  
  @scala.inline
  def origin: origin = "origin".asInstanceOf[origin]
  
  @scala.inline
  def `origin-when-cross-origin`: `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[`origin-when-cross-origin`]
  
  @scala.inline
  def reload: reload = "reload".asInstanceOf[reload]
  
  @scala.inline
  def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  
  @scala.inline
  def `strict-origin`: `strict-origin` = "strict-origin".asInstanceOf[`strict-origin`]
  
  @scala.inline
  def `strict-origin-when-cross-origin`: `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[`strict-origin-when-cross-origin`]
  
  @scala.inline
  def `unsafe-url`: `unsafe-url` = "unsafe-url".asInstanceOf[`unsafe-url`]
  
  @js.native
  sealed trait _empty extends ReferrerPolicy
  
  @js.native
  sealed trait cors extends RequestMode
  
  @js.native
  sealed trait default extends RequestCache
  
  @js.native
  sealed trait error extends RequestRedirect
  
  @js.native
  sealed trait follow extends RequestRedirect
  
  @js.native
  sealed trait `force-cache` extends RequestCache
  
  @js.native
  sealed trait include extends RequestCredentials
  
  @js.native
  sealed trait manual extends RequestRedirect
  
  @js.native
  sealed trait navigate extends RequestMode
  
  @js.native
  sealed trait `no-cache` extends RequestCache
  
  @js.native
  sealed trait `no-cors` extends RequestMode
  
  @js.native
  sealed trait `no-referrer` extends ReferrerPolicy
  
  @js.native
  sealed trait `no-referrer-when-downgrade` extends ReferrerPolicy
  
  @js.native
  sealed trait `no-store` extends RequestCache
  
  @js.native
  sealed trait omit extends RequestCredentials
  
  @js.native
  sealed trait `only-if-cached` extends RequestCache
  
  @js.native
  sealed trait origin extends ReferrerPolicy
  
  @js.native
  sealed trait `origin-when-cross-origin` extends ReferrerPolicy
  
  @js.native
  sealed trait reload extends RequestCache
  
  @js.native
  sealed trait `same-origin`
    extends ReferrerPolicy
       with RequestCredentials
       with RequestMode
  
  @js.native
  sealed trait `strict-origin` extends ReferrerPolicy
  
  @js.native
  sealed trait `strict-origin-when-cross-origin` extends ReferrerPolicy
  
  @js.native
  sealed trait `unsafe-url` extends ReferrerPolicy
}
