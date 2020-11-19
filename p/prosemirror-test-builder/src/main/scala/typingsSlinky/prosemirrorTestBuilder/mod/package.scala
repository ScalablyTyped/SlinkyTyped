package typingsSlinky.prosemirrorTestBuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Args = js.Array[
    java.lang.String | typingsSlinky.prosemirrorTestBuilder.mod.TaggedProsemirrorNode[js.Any] | typingsSlinky.prosemirrorTestBuilder.mod.TaggedFlatObject[js.Any]
  ]
  
  type Builder = js.Function2[
    /* testSchema */ typingsSlinky.prosemirrorModel.mod.Schema[java.lang.String, java.lang.String], 
    /* names */ typingsSlinky.std.Record[
      java.lang.String, 
      typingsSlinky.prosemirrorTestBuilder.mod.NodeTypeAttributes | typingsSlinky.prosemirrorTestBuilder.mod.MarkTypeAttributes
    ], 
    (typingsSlinky.std.Record[
      java.lang.String, 
      typingsSlinky.prosemirrorTestBuilder.mod.NodeBuilderMethod[typingsSlinky.prosemirrorModel.mod.Schema[java.lang.String, java.lang.String]]
    ]) with (typingsSlinky.std.Record[
      java.lang.String, 
      typingsSlinky.prosemirrorTestBuilder.mod.MarkBuilderMethod[typingsSlinky.prosemirrorModel.mod.Schema[java.lang.String, java.lang.String]]
    ]) with typingsSlinky.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.Builder with (org.scalablytyped.runtime.TopLevel[
      typingsSlinky.std.Record[
        java.lang.String, 
        typingsSlinky.prosemirrorTestBuilder.mod.NodeTypeAttributes | typingsSlinky.prosemirrorTestBuilder.mod.MarkTypeAttributes
      ]
    ])
  ]
  
  type MarkBuilderMethod[S /* <: typingsSlinky.prosemirrorModel.mod.Schema[_, _] */] = js.Function1[
    /* args */ typingsSlinky.prosemirrorTestBuilder.mod.Args, 
    typingsSlinky.prosemirrorTestBuilder.mod.TaggedFlatObject[S]
  ]
  
  type NodeBuilderMethod[S /* <: typingsSlinky.prosemirrorModel.mod.Schema[_, _] */] = js.Function1[
    /* args */ typingsSlinky.prosemirrorTestBuilder.mod.Args, 
    typingsSlinky.prosemirrorTestBuilder.mod.TaggedProsemirrorNode[S]
  ]
  
  type TestSchema = typingsSlinky.prosemirrorModel.mod.Schema[
    typingsSlinky.prosemirrorTestBuilder.mod.TestNodesUnion, 
    typingsSlinky.prosemirrorTestBuilder.mod.TestMarksUnion
  ]
}
