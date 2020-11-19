package typingsSlinky.jsdevtoolsReaddirEnhanced

import typingsSlinky.jsdevtoolsReaddirEnhanced.anon.Fn0
import typingsSlinky.jsdevtoolsReaddirEnhanced.anon.FnCall
import typingsSlinky.jsdevtoolsReaddirEnhanced.anon.FnCallDirOptions
import typingsSlinky.jsdevtoolsReaddirEnhanced.anon.FnCallDirOptionsCallback
import typingsSlinky.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalseundefine
import typingsSlinky.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typingsSlinky.jsdevtoolsReaddirEnhanced.typesPublicMod.Callback
import typingsSlinky.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jsdevtools/readdir-enhanced", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val default: Readdir_ = js.native
  
  val readdir: Readdir_ = js.native
  
  def readdirAsync(dir: String): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
  def readdirAsync(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
  
  def readdirIterator(dir: String): AsyncIterableIterator[String] = js.native
  def readdirIterator(dir: String, options: Optionsstatsfalseundefine): AsyncIterableIterator[String] = js.native
  def readdirIterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = js.native
  
  def readdirStream(dir: String): Readable = js.native
  def readdirStream(dir: String, options: Optionsstatsfalseundefine): Readable = js.native
  def readdirStream(dir: String, options: Optionsstatstrue): Readable = js.native
  
  def readdirSync(dir: String): js.Array[String] = js.native
  def readdirSync(dir: String, options: Optionsstatsfalseundefine): js.Array[String] = js.native
  def readdirSync(dir: String, options: Optionsstatstrue): js.Array[Stats] = js.native
  
  /* Inlined {None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}): std.Promise<std.Array<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Stats>>, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined} | undefined): std.Promise<std.Array<string>>, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Stats>>): void, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined}, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void, None (dir : string, options : undefined, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void, None (dir : string, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void} & {  sync :{None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}): std.Array<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Stats>, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined} | undefined): std.Array<string>},   async :{None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}): std.Promise<std.Array<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Stats>>, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined} | undefined): std.Promise<std.Array<string>>, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Stats>>): void, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined}, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void, None (dir : string, options : undefined, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void, None (dir : string, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void},   stream :{None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}): node.stream.Readable, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined} | undefined): node.stream.Readable},   iterator :{None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}): std.AsyncIterableIterator<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Stats>, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined} | undefined): std.AsyncIterableIterator<string>}} */
  @js.native
  trait Readdir_ extends js.Object {
    
    def apply(dir: String): js.Promise[js.Array[String]] = js.native
    def apply(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = js.native
    def apply(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
    def apply(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
    
    def async(dir: String): js.Promise[js.Array[String]] = js.native
    def async(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = js.native
    def async(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
    def async(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
    @JSName("async")
    var async_Original: FnCallDirOptionsCallback = js.native
    
    def iterator(dir: String): AsyncIterableIterator[String] = js.native
    def iterator(dir: String, options: Optionsstatsfalseundefine): AsyncIterableIterator[String] = js.native
    def iterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = js.native
    @JSName("iterator")
    var iterator_Original: Fn0 = js.native
    
    def stream(dir: String): Readable = js.native
    def stream(dir: String, options: Optionsstatsfalseundefine): Readable = js.native
    def stream(dir: String, options: Optionsstatstrue): Readable = js.native
    @JSName("stream")
    var stream_Original: FnCallDirOptions = js.native
    
    def sync(dir: String): js.Array[String] = js.native
    def sync(dir: String, options: Optionsstatsfalseundefine): js.Array[String] = js.native
    def sync(dir: String, options: Optionsstatstrue): js.Array[Stats] = js.native
    @JSName("sync")
    var sync_Original: FnCall = js.native
  }
}
