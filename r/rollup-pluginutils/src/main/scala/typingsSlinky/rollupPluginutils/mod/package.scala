package typingsSlinky.rollupPluginutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddExtension_ = js.Function2[
    /* filename */ java.lang.String, 
    /* ext */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type AttachScopes_ = js.Function2[
    /* ast */ typingsSlinky.estreeWalker.mod.Node, 
    /* propertyName */ js.UndefOr[java.lang.String], 
    typingsSlinky.rollupPluginutils.mod.AttachedScope
  ]
  type CreateFilter_ = js.Function3[
    /* include */ js.UndefOr[
      (js.Array[java.lang.String | js.RegExp]) | java.lang.String | js.RegExp | scala.Null
    ], 
    /* exclude */ js.UndefOr[
      (js.Array[java.lang.String | js.RegExp]) | java.lang.String | js.RegExp | scala.Null
    ], 
    /* options */ js.UndefOr[typingsSlinky.rollupPluginutils.AnonResolve], 
    js.Function1[/* id */ java.lang.String | js.Any, scala.Boolean]
  ]
  type DataToEsm_ = js.Function2[
    /* data */ js.Any, 
    /* options */ js.UndefOr[typingsSlinky.rollupPluginutils.mod.DataToEsmOptions], 
    java.lang.String
  ]
  type ExtractAssignedNames_ = js.Function1[/* param */ typingsSlinky.estreeWalker.mod.Node, js.Array[java.lang.String]]
  type MakeLegalIdentifier_ = js.Function1[/* str */ java.lang.String, java.lang.String]
}
