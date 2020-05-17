package typingsSlinky.nookies

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cookie.mod.CookieParseOptions
import typingsSlinky.cookie.mod.CookieSerializeOptions
import typingsSlinky.next.utilsMod.NextPageContext
import typingsSlinky.nookies.anon.PickNextPageContextreq
import typingsSlinky.nookies.anon.PickNextPageContextres
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nookies", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def destroyCookie(ctx: js.UndefOr[NextPageContext | Null], name: String): js.Object = js.native
  def destroyCookie(ctx: js.UndefOr[NextPageContext | Null], name: String, options: CookieSerializeOptions): js.Object = js.native
  def parseCookies(): StringDictionary[String] = js.native
  def parseCookies(ctx: Null, options: CookieParseOptions): StringDictionary[String] = js.native
  def parseCookies(ctx: PickNextPageContextreq): StringDictionary[String] = js.native
  def parseCookies(ctx: PickNextPageContextreq, options: CookieParseOptions): StringDictionary[String] = js.native
  def setCookie(
    ctx: js.UndefOr[Null | PickNextPageContextres],
    name: String,
    value: String,
    options: CookieSerializeOptions
  ): js.Object = js.native
  @js.native
  object default extends js.Object {
    var destroy: js.Function3[
        /* ctx */ js.UndefOr[NextPageContext | Null], 
        /* name */ String, 
        /* options */ js.UndefOr[CookieSerializeOptions], 
        js.Object
      ] = js.native
    var get: js.Function2[
        /* ctx */ js.UndefOr[PickNextPageContextreq | Null], 
        /* options */ js.UndefOr[CookieParseOptions], 
        StringDictionary[String]
      ] = js.native
    var set: js.Function4[
        /* ctx */ js.UndefOr[PickNextPageContextres | Null], 
        /* name */ String, 
        /* value */ String, 
        /* options */ CookieSerializeOptions, 
        js.Object
      ] = js.native
  }
  
}

