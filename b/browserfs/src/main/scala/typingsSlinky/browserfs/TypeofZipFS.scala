package typingsSlinky.browserfs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.browserfs.zipFSMod.CompressionMethod
import typingsSlinky.browserfs.zipFSMod.ZipFS
import typingsSlinky.browserfs.zipFSMod.ZipFSOptions
import typingsSlinky.browserfs.zipFSMod.ZipTOC
import typingsSlinky.browserfs.zipFSMod.default
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofZipFS
  extends Instantiable1[(/* input */ Buffer) | (/* input */ ZipTOC), default]
     with Instantiable2[(/* input */ Buffer) | (/* input */ ZipTOC), /* name */ String, default]
     with Instantiable3[
      (/* input */ Buffer) | (/* input */ ZipTOC), 
      /* name */ String, 
      /* deprecateMsg */ Boolean, 
      default
    ] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Constructs a ZipFS instance with the given options.
    */
  def Create(opts: ZipFSOptions, cb: BFSCallback[ZipFS]): Unit = js.native
  def RegisterDecompressionMethod(
    m: CompressionMethod,
    fcn: js.Function4[
      /* data */ Buffer, 
      /* compressedSize */ Double, 
      /* uncompressedSize */ Double, 
      /* flags */ Double, 
      Buffer
    ]
  ): Unit = js.native
  /* private */ def addToIndex(cd: js.Any, index: js.Any): js.Any = js.native
  /**
    * **Deprecated. Please use ZipFS.Create() method instead.**
    */
  def computeIndex(data: Buffer, cb: js.Function1[/* zipTOC */ ZipTOC, Unit]): Unit = js.native
  def computeIndex(data: Buffer, cb: js.Function1[/* zipTOC */ ZipTOC, Unit], deprecateMsg: Boolean): Unit = js.native
  /* private */ def computeIndexResponsive(
    data: js.Any,
    index: js.Any,
    cdPtr: js.Any,
    cdEnd: js.Any,
    cb: js.Any,
    cdEntries: js.Any,
    eocd: js.Any
  ): js.Any = js.native
  /**
    * Locates the end of central directory record at the end of the file.
    * Throws an exception if it cannot be found.
    */
  /* private */ def getEOCD(data: js.Any): js.Any = js.native
  def isAvailable(): Boolean = js.native
}

