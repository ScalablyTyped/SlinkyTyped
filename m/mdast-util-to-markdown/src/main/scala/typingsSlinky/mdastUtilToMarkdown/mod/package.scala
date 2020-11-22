package typingsSlinky.mdastUtilToMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Handle = js.Function4[
    /* node */ typingsSlinky.unist.mod.Node, 
    /* parent */ js.UndefOr[typingsSlinky.unist.mod.Parent | scala.Null], 
    /* context */ typingsSlinky.mdastUtilToMarkdown.mod.Context, 
    /* safeOptions */ typingsSlinky.mdastUtilToMarkdown.mod.SafeOptions, 
    java.lang.String
  ]
  
  type Handlers = org.scalablytyped.runtime.StringDictionary[typingsSlinky.mdastUtilToMarkdown.mod.Handler]
  
  type Join = js.Function4[
    /* left */ typingsSlinky.unist.mod.Node, 
    /* right */ typingsSlinky.unist.mod.Node, 
    /* parent */ typingsSlinky.unist.mod.Parent, 
    /* context */ typingsSlinky.mdastUtilToMarkdown.mod.Context, 
    scala.Boolean | scala.Null | scala.Unit
  ]
}
