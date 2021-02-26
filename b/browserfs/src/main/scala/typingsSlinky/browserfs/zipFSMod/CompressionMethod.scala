package typingsSlinky.browserfs.zipFSMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompressionMethod extends StObject
@JSImport("browserfs/dist/node/backend/ZipFS", "CompressionMethod")
@js.native
object CompressionMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressionMethod with Double] = js.native
  
  @js.native
  sealed trait BZIP2 extends CompressionMethod
  /* 12 */ val BZIP2: typingsSlinky.browserfs.zipFSMod.CompressionMethod.BZIP2 with Double = js.native
  
  @js.native
  sealed trait DEFLATE extends CompressionMethod
  /* 8 */ val DEFLATE: typingsSlinky.browserfs.zipFSMod.CompressionMethod.DEFLATE with Double = js.native
  
  @js.native
  sealed trait DEFLATE64 extends CompressionMethod
  /* 9 */ val DEFLATE64: typingsSlinky.browserfs.zipFSMod.CompressionMethod.DEFLATE64 with Double = js.native
  
  @js.native
  sealed trait IMPLODE extends CompressionMethod
  /* 6 */ val IMPLODE: typingsSlinky.browserfs.zipFSMod.CompressionMethod.IMPLODE with Double = js.native
  
  @js.native
  sealed trait LZ77 extends CompressionMethod
  /* 19 */ val LZ77: typingsSlinky.browserfs.zipFSMod.CompressionMethod.LZ77 with Double = js.native
  
  @js.native
  sealed trait LZMA extends CompressionMethod
  /* 14 */ val LZMA: typingsSlinky.browserfs.zipFSMod.CompressionMethod.LZMA with Double = js.native
  
  @js.native
  sealed trait PPMD extends CompressionMethod
  /* 98 */ val PPMD: typingsSlinky.browserfs.zipFSMod.CompressionMethod.PPMD with Double = js.native
  
  @js.native
  sealed trait REDUCED_1 extends CompressionMethod
  /* 2 */ val REDUCED_1: typingsSlinky.browserfs.zipFSMod.CompressionMethod.REDUCED_1 with Double = js.native
  
  @js.native
  sealed trait REDUCED_2 extends CompressionMethod
  /* 3 */ val REDUCED_2: typingsSlinky.browserfs.zipFSMod.CompressionMethod.REDUCED_2 with Double = js.native
  
  @js.native
  sealed trait REDUCED_3 extends CompressionMethod
  /* 4 */ val REDUCED_3: typingsSlinky.browserfs.zipFSMod.CompressionMethod.REDUCED_3 with Double = js.native
  
  @js.native
  sealed trait REDUCED_4 extends CompressionMethod
  /* 5 */ val REDUCED_4: typingsSlinky.browserfs.zipFSMod.CompressionMethod.REDUCED_4 with Double = js.native
  
  @js.native
  sealed trait SHRUNK extends CompressionMethod
  /* 1 */ val SHRUNK: typingsSlinky.browserfs.zipFSMod.CompressionMethod.SHRUNK with Double = js.native
  
  @js.native
  sealed trait STORED extends CompressionMethod
  /* 0 */ val STORED: typingsSlinky.browserfs.zipFSMod.CompressionMethod.STORED with Double = js.native
  
  @js.native
  sealed trait TERSE_NEW extends CompressionMethod
  /* 18 */ val TERSE_NEW: typingsSlinky.browserfs.zipFSMod.CompressionMethod.TERSE_NEW with Double = js.native
  
  @js.native
  sealed trait TERSE_OLD extends CompressionMethod
  /* 10 */ val TERSE_OLD: typingsSlinky.browserfs.zipFSMod.CompressionMethod.TERSE_OLD with Double = js.native
  
  @js.native
  sealed trait WAVPACK extends CompressionMethod
  /* 97 */ val WAVPACK: typingsSlinky.browserfs.zipFSMod.CompressionMethod.WAVPACK with Double = js.native
}
