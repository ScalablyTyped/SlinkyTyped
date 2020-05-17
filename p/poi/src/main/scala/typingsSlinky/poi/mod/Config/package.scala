package typingsSlinky.poi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Config {
  type ChainWebpack = js.Function2[
    /* config */ typingsSlinky.webpackChain.mod.^, 
    /* opts */ typingsSlinky.poi.mod.Opts, 
    scala.Unit
  ]
  type Constants = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Css = typingsSlinky.poi.mod.Config.Css_
  type Envs = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Output = typingsSlinky.poi.mod.Config.Output_
  type Pages = org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsSlinky.poi.anon.PartialOptionsentrystring]
  type Plugins = js.Array[java.lang.String | typingsSlinky.poi.mod.Config.PluginOption]
}
