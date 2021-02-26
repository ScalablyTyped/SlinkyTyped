package typingsSlinky.codemirror.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.codemirror.anon.Changed
import typingsSlinky.codemirror.codemirrorStrings.`type`
import typingsSlinky.codemirror.codemirrorStrings.completions
import typingsSlinky.codemirror.codemirrorStrings.definition
import typingsSlinky.codemirror.codemirrorStrings.documentation
import typingsSlinky.codemirror.codemirrorStrings.files
import typingsSlinky.codemirror.codemirrorStrings.properties
import typingsSlinky.codemirror.codemirrorStrings.refs
import typingsSlinky.codemirror.codemirrorStrings.rename
import typingsSlinky.tern.ternMod.CompletionsQuery
import typingsSlinky.tern.ternMod.CompletionsQueryResult
import typingsSlinky.tern.ternMod.DefinitionQuery
import typingsSlinky.tern.ternMod.DefinitionQueryResult
import typingsSlinky.tern.ternMod.DocumentationQuery
import typingsSlinky.tern.ternMod.DocumentationQueryResult
import typingsSlinky.tern.ternMod.FilesQuery
import typingsSlinky.tern.ternMod.FilesQueryResult
import typingsSlinky.tern.ternMod.PropertiesQuery
import typingsSlinky.tern.ternMod.PropertiesQueryResult
import typingsSlinky.tern.ternMod.RefsQuery
import typingsSlinky.tern.ternMod.RefsQueryResult
import typingsSlinky.tern.ternMod.RenameQuery
import typingsSlinky.tern.ternMod.RenameQueryResult
import typingsSlinky.tern.ternMod.Server
import typingsSlinky.tern.ternMod.TypeQuery
import typingsSlinky.tern.ternMod.TypeQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TernServer extends StObject {
  
  def addDoc(name: String, doc: typingsSlinky.codemirror.mod.Doc): typingsSlinky.codemirror.anon.Doc = js.native
  
  def complete(cm: typingsSlinky.codemirror.mod.Doc): Unit = js.native
  
  def delDoc(id: String): Unit = js.native
  def delDoc(id: typingsSlinky.codemirror.mod.Doc): Unit = js.native
  def delDoc(id: Editor): Unit = js.native
  
  def destroy(): Unit = js.native
  
  val docs: StringDictionary[Changed] = js.native
  
  def hideDoc(id: String): Unit = js.native
  def hideDoc(id: typingsSlinky.codemirror.mod.Doc): Unit = js.native
  def hideDoc(id: Editor): Unit = js.native
  
  def jumpBack(cm: typingsSlinky.codemirror.mod.Doc): Unit = js.native
  
  def jumpToDef(cm: typingsSlinky.codemirror.mod.Doc): Unit = js.native
  
  val options: TernOptions = js.native
  
  def rename(cm: typingsSlinky.codemirror.mod.Doc): Unit = js.native
  
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: CompletionsQuery,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[CompletionsQueryResult], 
      Unit
    ]
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: CompletionsQuery,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[CompletionsQueryResult], 
      Unit
    ],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: DefinitionQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[DefinitionQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: DefinitionQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[DefinitionQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: DocumentationQuery,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[DocumentationQueryResult], 
      Unit
    ]
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: DocumentationQuery,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[DocumentationQueryResult], 
      Unit
    ],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: FilesQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[FilesQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: FilesQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[FilesQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: PropertiesQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[PropertiesQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: PropertiesQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[PropertiesQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: RefsQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[RefsQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: RefsQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[RefsQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: RenameQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[RenameQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: RenameQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[RenameQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: TypeQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[TypeQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: typingsSlinky.codemirror.mod.Doc,
    query: TypeQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[TypeQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  @JSName("request")
  def request_result[Q /* <: files | rename | `type` | refs | completions | documentation | properties | definition */](
    cm: typingsSlinky.codemirror.mod.Doc,
    query: Q,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q]['result'] */ js.Any
      ], 
      Unit
    ]
  ): Unit = js.native
  @JSName("request")
  def request_result[Q /* <: files | rename | `type` | refs | completions | documentation | properties | definition */](
    cm: typingsSlinky.codemirror.mod.Doc,
    query: Q,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q]['result'] */ js.Any
      ], 
      Unit
    ],
    pos: Position
  ): Unit = js.native
  
  def selectName(cm: typingsSlinky.codemirror.mod.Doc): Unit = js.native
  
  val server: Server = js.native
  
  def showDocs(cm: typingsSlinky.codemirror.mod.Doc): Unit = js.native
  def showDocs(cm: typingsSlinky.codemirror.mod.Doc, pos: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def showDocs(cm: typingsSlinky.codemirror.mod.Doc, pos: Double): Unit = js.native
  def showDocs(cm: typingsSlinky.codemirror.mod.Doc, pos: Double, callback: js.Function): Unit = js.native
  def showDocs(cm: typingsSlinky.codemirror.mod.Doc, pos: Position): Unit = js.native
  def showDocs(cm: typingsSlinky.codemirror.mod.Doc, pos: Position, callback: js.Function): Unit = js.native
  
  def showType(cm: typingsSlinky.codemirror.mod.Doc): Unit = js.native
  def showType(cm: typingsSlinky.codemirror.mod.Doc, pos: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def showType(cm: typingsSlinky.codemirror.mod.Doc, pos: Double): Unit = js.native
  def showType(cm: typingsSlinky.codemirror.mod.Doc, pos: Double, callback: js.Function): Unit = js.native
  def showType(cm: typingsSlinky.codemirror.mod.Doc, pos: Position): Unit = js.native
  def showType(cm: typingsSlinky.codemirror.mod.Doc, pos: Position, callback: js.Function): Unit = js.native
  
  def updateArgHints(cm: typingsSlinky.codemirror.mod.Doc): Unit = js.native
}
