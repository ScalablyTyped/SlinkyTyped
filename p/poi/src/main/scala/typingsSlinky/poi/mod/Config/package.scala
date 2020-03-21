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
  type ConfigureWebpack = typingsSlinky.webpack.mod.Configuration | (js.Function2[
    /* config */ typingsSlinky.webpack.mod.Configuration, 
    /* opts */ typingsSlinky.poi.mod.Opts, 
    scala.Unit | typingsSlinky.webpack.mod.Configuration
  ])
  type Constants = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Css = typingsSlinky.poi.mod.Config.Css_
  type Entry = js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | typingsSlinky.webpack.mod.Entry | typingsSlinky.webpack.mod.EntryFunc
  ]
  type Envs = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Output = typingsSlinky.poi.mod.Config.Output_
  type Pages = org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsSlinky.poi.PartialOptionsentrystring]
  type Plugins = js.Array[java.lang.String | typingsSlinky.poi.mod.Config.PluginOption]
  type PublicFolder = java.lang.String | scala.Boolean
}
