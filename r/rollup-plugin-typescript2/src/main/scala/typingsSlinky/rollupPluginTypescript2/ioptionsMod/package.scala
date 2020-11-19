package typingsSlinky.rollupPluginTypescript2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ioptionsMod {
  
  type TransformerFactoryCreator = js.Function1[
    /* ls */ typingsSlinky.typescript.mod.LanguageService, 
    typingsSlinky.typescript.mod.CustomTransformers | typingsSlinky.rollupPluginTypescript2.ioptionsMod.ICustomTransformer
  ]
}
