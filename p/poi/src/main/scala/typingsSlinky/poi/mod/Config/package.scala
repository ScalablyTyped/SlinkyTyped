package typingsSlinky.poi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Config {
  
  type ChainWebpack = js.Function2[
    /* config */ typingsSlinky.webpackChain.mod.^, 
    /* opts */ typingsSlinky.poi.mod.Opts, 
    scala.Unit
  ]
  
  type ConfigureWebpack = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ js.Any) | (js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ /* config */ js.Any, 
    /* opts */ typingsSlinky.poi.mod.Opts, 
    scala.Unit | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ js.Any)
  ])
  
  type Constants = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type Css = typingsSlinky.poi.mod.Config.Css_
  
  type Entry = /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig * / any['entry'] */ js.Any
  
  type Envs = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type Output = typingsSlinky.poi.mod.Config.Output_
  
  type Pages = org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsSlinky.poi.anon.PartialOptionsentrystring]
  
  type Plugins = js.Array[java.lang.String | typingsSlinky.poi.mod.Config.PluginOption]
  
  type PublicFolder = java.lang.String | scala.Boolean
}
