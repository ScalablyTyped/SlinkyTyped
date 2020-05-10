package typingsSlinky.docxTemplates

import typingsSlinky.docxTemplates.docxTemplatesStrings.JS
import typingsSlinky.docxTemplates.docxTemplatesStrings.XML
import typingsSlinky.docxTemplates.typesMod.Node
import typingsSlinky.docxTemplates.typesMod.UserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Create Report from docx template
    *
    * example:
    * ```js
    * createReport({
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
  def createReport(options: UserOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @JSName("createReport")
  def createReport_JS(options: UserOptions, _probe: JS): js.Promise[Node] = js.native
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @JSName("createReport")
  def createReport_XML(options: UserOptions, _probe: XML): js.Promise[String] = js.native
  /**
    * Create Report from docx template
    *
    * example:
    * ```js
    * createReport({
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
  def default(options: UserOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @JSName("default")
  def default_JS(options: UserOptions, _probe: JS): js.Promise[Node] = js.native
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @JSName("default")
  def default_XML(options: UserOptions, _probe: XML): js.Promise[String] = js.native
}

