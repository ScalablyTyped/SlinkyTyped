package typingsSlinky.cosmiconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Loader = (js.Function2[
    /* filepath */ java.lang.String, 
    /* content */ java.lang.String, 
    js.Promise[typingsSlinky.cosmiconfig.mod.LoaderResult]
  ]) | typingsSlinky.cosmiconfig.mod.LoaderSync
  
  type LoaderResult = typingsSlinky.cosmiconfig.typesMod.Config | scala.Null
  
  type LoaderSync = js.Function2[
    /* filepath */ java.lang.String, 
    /* content */ java.lang.String, 
    typingsSlinky.cosmiconfig.mod.LoaderResult
  ]
  
  type Transform = (js.Function1[
    /* CosmiconfigResult */ typingsSlinky.cosmiconfig.typesMod.CosmiconfigResult, 
    js.Promise[typingsSlinky.cosmiconfig.typesMod.CosmiconfigResult]
  ]) | typingsSlinky.cosmiconfig.mod.TransformSync
  
  type TransformSync = js.Function1[
    /* CosmiconfigResult */ typingsSlinky.cosmiconfig.typesMod.CosmiconfigResult, 
    typingsSlinky.cosmiconfig.typesMod.CosmiconfigResult
  ]
}
