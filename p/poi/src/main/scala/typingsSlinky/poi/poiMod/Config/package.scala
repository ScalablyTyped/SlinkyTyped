package typingsSlinky.poi.poiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Config {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod.Options
  import typingsSlinky.poi.Anon_Chunks
  import typingsSlinky.poi.poiMod.Opts
  import typingsSlinky.std.Partial
  import typingsSlinky.webpack.webpackMod.Configuration
  import typingsSlinky.webpack.webpackMod.EntryFunc

  type ChainWebpack = js.Function2[
    /* config */ typingsSlinky.webpackDashChain.webpackDashChainMod.^, 
    /* opts */ Opts, 
    Unit
  ]
  type ConfigureWebpack = Configuration | (js.Function2[/* config */ Configuration, /* opts */ Opts, Unit | Configuration])
  type Constants = StringDictionary[String]
  type Css = Css_
  type Entry = js.UndefOr[String | js.Array[String] | typingsSlinky.webpack.webpackMod.Entry | EntryFunc]
  type Envs = StringDictionary[String]
  type Output = Output_
  type Pages = StringDictionary[String | (Partial[Options] with Anon_Chunks)]
  type Plugins = js.Array[String | PluginOption]
  type PublicFolder = String | Boolean
}
