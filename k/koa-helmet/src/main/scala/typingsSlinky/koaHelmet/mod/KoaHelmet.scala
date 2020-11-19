package typingsSlinky.koaHelmet.mod

import typingsSlinky.helmet.mod.IHelmetConfiguration
import typingsSlinky.helmet.mod.IHelmetDnsPrefetchControlConfiguration
import typingsSlinky.helmet.mod.IHelmetExpectCtConfiguration
import typingsSlinky.helmet.mod.IHelmetFrameguardConfiguration
import typingsSlinky.helmet.mod.IHelmetHidePoweredByConfiguration
import typingsSlinky.helmet.mod.IHelmetHpkpConfiguration
import typingsSlinky.helmet.mod.IHelmetHstsConfiguration
import typingsSlinky.helmet.mod.IHelmetPermittedCrossDomainPoliciesConfiguration
import typingsSlinky.helmet.mod.IHelmetReferrerPolicyConfiguration
import typingsSlinky.helmet.mod.IHelmetXssFilterConfiguration
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KoaHelmet extends js.Object {
  
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: IHelmetConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  
  def contentSecurityPolicy(): Middleware[DefaultState, DefaultContext] = js.native
  def contentSecurityPolicy(options: KoaHelmetContentSecurityPolicyConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  
  def dnsPrefetchControl(): Middleware[DefaultState, DefaultContext] = js.native
  def dnsPrefetchControl(options: IHelmetDnsPrefetchControlConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  
  def expectCt(): Middleware[DefaultState, DefaultContext] = js.native
  def expectCt(options: IHelmetExpectCtConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  
  def featurePolicy(options: KoaHelmetFeaturePolicyConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  
  def frameguard(): Middleware[DefaultState, DefaultContext] = js.native
  def frameguard(options: IHelmetFrameguardConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  
  def hidePoweredBy(): Middleware[DefaultState, DefaultContext] = js.native
  def hidePoweredBy(options: IHelmetHidePoweredByConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  
  def hpkp(): Middleware[DefaultState, DefaultContext] = js.native
  def hpkp(options: IHelmetHpkpConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  
  def hsts(): Middleware[DefaultState, DefaultContext] = js.native
  def hsts(options: IHelmetHstsConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  
  def ieNoOpen(): Middleware[DefaultState, DefaultContext] = js.native
  
  def noCache(): Middleware[DefaultState, DefaultContext] = js.native
  def noCache(options: js.Any): Middleware[DefaultState, DefaultContext] = js.native
  
  def noSniff(): Middleware[DefaultState, DefaultContext] = js.native
  
  def permittedCrossDomainPolicies(): Middleware[DefaultState, DefaultContext] = js.native
  def permittedCrossDomainPolicies(options: IHelmetPermittedCrossDomainPoliciesConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  
  def referrerPolicy(): Middleware[DefaultState, DefaultContext] = js.native
  def referrerPolicy(options: IHelmetReferrerPolicyConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  
  def xssFilter(): Middleware[DefaultState, DefaultContext] = js.native
  def xssFilter(options: IHelmetXssFilterConfiguration): Middleware[DefaultState, DefaultContext] = js.native
}
