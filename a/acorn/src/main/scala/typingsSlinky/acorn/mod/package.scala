package typingsSlinky.acorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ILooseParserClass = org.scalablytyped.runtime.Instantiable2[
    /* input */ java.lang.String, 
    js.UndefOr[/* options */ typingsSlinky.acorn.mod.Options], 
    typingsSlinky.acorn.mod.ILooseParser
  ]
  // TODO: rename type.
  type IParse = js.Function2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.acorn.mod.Options], 
    typingsSlinky.estree.mod.Program
  ]
  type PlainObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type PluginsObject = org.scalablytyped.runtime.StringDictionary[
    js.Function2[/* p */ typingsSlinky.acorn.mod.Parser, /* config */ js.Any, scala.Unit]
  ]
}
