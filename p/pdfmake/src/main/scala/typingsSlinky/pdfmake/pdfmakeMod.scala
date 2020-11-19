package typingsSlinky.pdfmake

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.Window
import typingsSlinky.node.Buffer
import typingsSlinky.pdfkit.PDFKit.PDFDocument
import typingsSlinky.pdfmake.interfacesMod.BufferOptions
import typingsSlinky.pdfmake.interfacesMod.CustomTableLayout
import typingsSlinky.pdfmake.interfacesMod.TDocumentDefinitions
import typingsSlinky.pdfmake.interfacesMod.TFontDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfmake/build/pdfmake", JSImport.Namespace)
@js.native
object pdfmakeMod extends js.Object {
  
  def createPdf(documentDefinitions: TDocumentDefinitions): TCreatedPdf = js.native
  def createPdf(
    documentDefinitions: TDocumentDefinitions,
    tableLayouts: js.UndefOr[scala.Nothing],
    fonts: js.UndefOr[scala.Nothing],
    vfs: StringDictionary[String]
  ): TCreatedPdf = js.native
  def createPdf(
    documentDefinitions: TDocumentDefinitions,
    tableLayouts: js.UndefOr[scala.Nothing],
    fonts: TFontDictionary
  ): TCreatedPdf = js.native
  def createPdf(
    documentDefinitions: TDocumentDefinitions,
    tableLayouts: js.UndefOr[scala.Nothing],
    fonts: TFontDictionary,
    vfs: StringDictionary[String]
  ): TCreatedPdf = js.native
  def createPdf(documentDefinitions: TDocumentDefinitions, tableLayouts: StringDictionary[CustomTableLayout]): TCreatedPdf = js.native
  def createPdf(
    documentDefinitions: TDocumentDefinitions,
    tableLayouts: StringDictionary[CustomTableLayout],
    fonts: js.UndefOr[scala.Nothing],
    vfs: StringDictionary[String]
  ): TCreatedPdf = js.native
  def createPdf(
    documentDefinitions: TDocumentDefinitions,
    tableLayouts: StringDictionary[CustomTableLayout],
    fonts: TFontDictionary
  ): TCreatedPdf = js.native
  def createPdf(
    documentDefinitions: TDocumentDefinitions,
    tableLayouts: StringDictionary[CustomTableLayout],
    fonts: TFontDictionary,
    vfs: StringDictionary[String]
  ): TCreatedPdf = js.native
  
  var fonts: TFontDictionary = js.native
  
  @js.native
  trait TCreatedPdf extends js.Object {
    
    def download(): Unit = js.native
    def download(cb: js.UndefOr[scala.Nothing], options: BufferOptions): Unit = js.native
    def download(cb: js.Function0[Unit]): Unit = js.native
    def download(cb: js.Function0[Unit], options: BufferOptions): Unit = js.native
    def download(defaultFileName: String): Unit = js.native
    def download(defaultFileName: String, cb: js.UndefOr[scala.Nothing], options: BufferOptions): Unit = js.native
    def download(defaultFileName: String, cb: js.Function0[Unit]): Unit = js.native
    def download(defaultFileName: String, cb: js.Function0[Unit], options: BufferOptions): Unit = js.native
    
    def getBase64(cb: js.Function1[/* result */ String, Unit]): Unit = js.native
    def getBase64(cb: js.Function1[/* result */ String, Unit], options: BufferOptions): Unit = js.native
    
    def getBlob(cb: js.Function1[/* result */ Blob, Unit]): Unit = js.native
    def getBlob(cb: js.Function1[/* result */ Blob, Unit], options: BufferOptions): Unit = js.native
    
    def getBuffer(cb: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
    def getBuffer(cb: js.Function1[/* result */ Buffer, Unit], options: BufferOptions): Unit = js.native
    
    def getDataUrl(cb: js.Function1[/* result */ String, Unit]): Unit = js.native
    def getDataUrl(cb: js.Function1[/* result */ String, Unit], options: BufferOptions): Unit = js.native
    
    def getStream(): PDFDocument = js.native
    def getStream(options: BufferOptions): PDFDocument = js.native
    
     // minimal version 0.1.41
    def open(): Unit = js.native
    def open(options: js.UndefOr[scala.Nothing], win: Window): Unit = js.native
    def open(options: BufferOptions): Unit = js.native
    def open(options: BufferOptions, win: Window): Unit = js.native
    
    def print(): Unit = js.native
    def print(options: js.UndefOr[scala.Nothing], win: Window): Unit = js.native
    def print(options: BufferOptions): Unit = js.native
    def print(options: BufferOptions, win: Window): Unit = js.native
  }
  
  @js.native
  object tableLayouts extends /* name */ StringDictionary[CustomTableLayout]
  
  @js.native
  object vfs extends /* file */ StringDictionary[String]
}
