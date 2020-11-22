package typingsSlinky.jupyterlabCodemirror.modeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Mode {
  
  /**
    * The interface for a codemirror spec resolver.
    */
  type ISpecLoader = js.Function1[
    /* spec */ typingsSlinky.jupyterlabCodemirror.modeMod.Mode.ISpec, 
    js.Promise[scala.Boolean]
  ]
}
