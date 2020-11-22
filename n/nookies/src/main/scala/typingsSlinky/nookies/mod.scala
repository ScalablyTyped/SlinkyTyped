package typingsSlinky.nookies

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cookie.mod.CookieParseOptions
import typingsSlinky.cookie.mod.CookieSerializeOptions
import typingsSlinky.nookies.anon.PickNextPageContextreq
import typingsSlinky.nookies.anon.PickNextPageContextres
import typingsSlinky.nookies.anon.Req
import typingsSlinky.nookies.anon.ReqRequest
import typingsSlinky.nookies.anon.Res
import typingsSlinky.nookies.anon.ResResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nookies", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def destroyCookie(ctx: js.UndefOr[scala.Nothing], name: String): js.Object = js.native
  def destroyCookie(ctx: js.UndefOr[scala.Nothing], name: String, options: CookieSerializeOptions): js.Object = js.native
  def destroyCookie(ctx: Null, name: String): js.Object = js.native
  def destroyCookie(ctx: Null, name: String, options: CookieSerializeOptions): js.Object = js.native
  def destroyCookie(ctx: PickNextPageContextres, name: String): js.Object = js.native
  def destroyCookie(ctx: PickNextPageContextres, name: String, options: CookieSerializeOptions): js.Object = js.native
  def destroyCookie(ctx: ResResponse, name: String): js.Object = js.native
  def destroyCookie(ctx: ResResponse, name: String, options: CookieSerializeOptions): js.Object = js.native
  def destroyCookie(ctx: Res, name: String): js.Object = js.native
  def destroyCookie(ctx: Res, name: String, options: CookieSerializeOptions): js.Object = js.native
  
  def parseCookies(): StringDictionary[String] = js.native
  def parseCookies(ctx: js.UndefOr[scala.Nothing], options: CookieParseOptions): StringDictionary[String] = js.native
  def parseCookies(ctx: Null, options: CookieParseOptions): StringDictionary[String] = js.native
  def parseCookies(ctx: PickNextPageContextreq): StringDictionary[String] = js.native
  def parseCookies(ctx: PickNextPageContextreq, options: CookieParseOptions): StringDictionary[String] = js.native
  def parseCookies(ctx: Req): StringDictionary[String] = js.native
  def parseCookies(ctx: ReqRequest): StringDictionary[String] = js.native
  def parseCookies(ctx: ReqRequest, options: CookieParseOptions): StringDictionary[String] = js.native
  def parseCookies(ctx: Req, options: CookieParseOptions): StringDictionary[String] = js.native
  
  def setCookie(ctx: js.UndefOr[scala.Nothing], name: String, value: String, options: CookieSerializeOptions): js.Object = js.native
  def setCookie(ctx: Null, name: String, value: String, options: CookieSerializeOptions): js.Object = js.native
  def setCookie(ctx: PickNextPageContextres, name: String, value: String, options: CookieSerializeOptions): js.Object = js.native
  def setCookie(ctx: ResResponse, name: String, value: String, options: CookieSerializeOptions): js.Object = js.native
  def setCookie(ctx: Res, name: String, value: String, options: CookieSerializeOptions): js.Object = js.native
  
  @js.native
  object default extends js.Object {
    
    var destroy: js.Function3[
        /* ctx */ js.UndefOr[PickNextPageContextres | Res | ResResponse | Null], 
        /* name */ String, 
        /* options */ js.UndefOr[CookieSerializeOptions], 
        js.Object
      ] = js.native
    
    var get: js.Function2[
        /* ctx */ js.UndefOr[PickNextPageContextreq | Req | ReqRequest | Null], 
        /* options */ js.UndefOr[CookieParseOptions], 
        StringDictionary[String]
      ] = js.native
    
    var set: js.Function4[
        /* ctx */ js.UndefOr[PickNextPageContextres | Res | ResResponse | Null], 
        /* name */ String, 
        /* value */ String, 
        /* options */ CookieSerializeOptions, 
        js.Object
      ] = js.native
  }
}
