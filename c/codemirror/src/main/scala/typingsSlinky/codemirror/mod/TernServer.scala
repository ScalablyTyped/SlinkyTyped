package typingsSlinky.codemirror.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TernServer extends js.Object {
  val docs: StringDictionary[Changed] = js.native
  val options: TernOptions = js.native
  val server: Server = js.native
  def addDoc(name: String, doc: Doc): typingsSlinky.codemirror.anon.Doc = js.native
  def complete(cm: Doc): Unit = js.native
  def delDoc(id: String): Unit = js.native
  def delDoc(id: Doc): Unit = js.native
  def delDoc(id: Editor): Unit = js.native
  def destroy(): Unit = js.native
  def hideDoc(id: String): Unit = js.native
  def hideDoc(id: Doc): Unit = js.native
  def hideDoc(id: Editor): Unit = js.native
  def jumpBack(cm: Doc): Unit = js.native
  def jumpToDef(cm: Doc): Unit = js.native
  def rename(cm: Doc): Unit = js.native
  def request(
    cm: Doc,
    query: CompletionsQuery,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[CompletionsQueryResult], 
      Unit
    ]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: CompletionsQuery,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[CompletionsQueryResult], 
      Unit
    ],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: DefinitionQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[DefinitionQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: DefinitionQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[DefinitionQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: DocumentationQuery,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[DocumentationQueryResult], 
      Unit
    ]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: DocumentationQuery,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[DocumentationQueryResult], 
      Unit
    ],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: FilesQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[FilesQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: FilesQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[FilesQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: PropertiesQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[PropertiesQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: PropertiesQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[PropertiesQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: RefsQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[RefsQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: RefsQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[RefsQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: RenameQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[RenameQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: RenameQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[RenameQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  def request(
    cm: Doc,
    query: TypeQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[TypeQueryResult], Unit]
  ): Unit = js.native
  def request(
    cm: Doc,
    query: TypeQuery,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[TypeQueryResult], Unit],
    pos: Position
  ): Unit = js.native
  @JSName("request")
  def request_result[Q /* <: files | rename | `type` | refs | completions | documentation | properties | definition */](
    cm: Doc,
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
    cm: Doc,
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
  def selectName(cm: Doc): Unit = js.native
  def showDocs(cm: Doc): Unit = js.native
  def showDocs(cm: Doc, pos: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def showDocs(cm: Doc, pos: Double): Unit = js.native
  def showDocs(cm: Doc, pos: Double, callback: js.Function): Unit = js.native
  def showDocs(cm: Doc, pos: Position): Unit = js.native
  def showDocs(cm: Doc, pos: Position, callback: js.Function): Unit = js.native
  def showType(cm: Doc): Unit = js.native
  def showType(cm: Doc, pos: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def showType(cm: Doc, pos: Double): Unit = js.native
  def showType(cm: Doc, pos: Double, callback: js.Function): Unit = js.native
  def showType(cm: Doc, pos: Position): Unit = js.native
  def showType(cm: Doc, pos: Position, callback: js.Function): Unit = js.native
  def updateArgHints(cm: Doc): Unit = js.native
}

@JSImport("codemirror", "TernServer")
@js.native
object TernServer extends TopLevel[TernConstructor]

