package typingsSlinky.docxTemplates

import typingsSlinky.docxTemplates.docxTemplatesStrings.JS
import typingsSlinky.docxTemplates.docxTemplatesStrings.XML
import typingsSlinky.docxTemplates.typesMod.CommandSummary
import typingsSlinky.docxTemplates.typesMod.Node
import typingsSlinky.docxTemplates.typesMod.UserOptions
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create Report from docx template
    *
    * example:
    * ```js
    * const report = await createReport({
    *   template,
    *   data: query => graphqlServer.execute(query),
    *   additionalJsContext: {
    *     // all of these will be available to JS snippets in your template commands
    *     foo: 'bar',
    *     qrCode: async url => {
    *       // do stuff
    *     },
    *   },
    *   cmdDelimiter: '+++',
    *   literalXmlDelimiter: '||',
    *   processLineBreaks: true,
    *   noSandbox: false,
    * });
    * ```
    *
    * @param options Options for Report
    */
  @JSImport("docx-templates", JSImport.Default)
  @js.native
  def default(options: UserOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  
  /**
    * Create Report from docx template
    *
    * example:
    * ```js
    * const report = await createReport({
    *   template,
    *   data: query => graphqlServer.execute(query),
    *   additionalJsContext: {
    *     // all of these will be available to JS snippets in your template commands
    *     foo: 'bar',
    *     qrCode: async url => {
    *       // do stuff
    *     },
    *   },
    *   cmdDelimiter: '+++',
    *   literalXmlDelimiter: '||',
    *   processLineBreaks: true,
    *   noSandbox: false,
    * });
    * ```
    *
    * @param options Options for Report
    */
  @JSImport("docx-templates", "createReport")
  @js.native
  def createReport(options: UserOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @JSImport("docx-templates", "createReport")
  @js.native
  def createReport_JS(options: UserOptions, _probe: JS): js.Promise[Node] = js.native
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @JSImport("docx-templates", "createReport")
  @js.native
  def createReport_XML(options: UserOptions, _probe: XML): js.Promise[String] = js.native
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @JSImport("docx-templates", JSImport.Default)
  @js.native
  def default_JS(options: UserOptions, _probe: JS): js.Promise[Node] = js.native
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @JSImport("docx-templates", JSImport.Default)
  @js.native
  def default_XML(options: UserOptions, _probe: XML): js.Promise[String] = js.native
  
  @JSImport("docx-templates", "listCommands")
  @js.native
  def listCommands(template: Buffer): js.Promise[js.Array[CommandSummary]] = js.native
  @JSImport("docx-templates", "listCommands")
  @js.native
  def listCommands(template: Buffer, delimiter: String): js.Promise[js.Array[CommandSummary]] = js.native
  @JSImport("docx-templates", "listCommands")
  @js.native
  def listCommands(template: Buffer, delimiter: js.Tuple2[String, String]): js.Promise[js.Array[CommandSummary]] = js.native
}
