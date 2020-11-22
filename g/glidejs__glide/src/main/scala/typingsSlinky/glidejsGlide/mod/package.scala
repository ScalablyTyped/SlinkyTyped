package typingsSlinky.glidejsGlide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * The component is a simple function that returns an object. Each component
    * has a single responsibility and communicates with other components using
    * events.
    */
  type ComponentFunction = js.Function3[
    /* glide */ typingsSlinky.glidejsGlide.mod.Static, 
    /* components */ js.Object, 
    /* events */ js.Any, 
    typingsSlinky.glidejsGlide.anon.Mount
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.Greaterthansign
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.Lessthansign
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.GreaterthansignGreaterthansign
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.LessthansignLessthansign
    - java.lang.String
  */
  type Pattern = typingsSlinky.glidejsGlide.mod._Pattern | java.lang.String
  
  type TransformerFunction = js.Function3[
    /* glide */ typingsSlinky.glidejsGlide.mod.Static, 
    /* components */ js.Object, 
    /* events */ js.Any, 
    typingsSlinky.glidejsGlide.anon.Modify
  ]
}
