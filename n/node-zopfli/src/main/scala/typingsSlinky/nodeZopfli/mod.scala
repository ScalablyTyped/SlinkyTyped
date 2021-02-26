package typingsSlinky.nodeZopfli

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-zopfli", JSImport.Namespace)
  @js.native
  class ^ () extends Transform {
    def this(format: Format) = this()
    def this(format: js.UndefOr[scala.Nothing], options: Options) = this()
    def this(format: Format, options: Options) = this()
  }
  
  /* static member */
  @JSImport("node-zopfli", "compress")
  @js.native
  def compress(input: Buffer, format: Format): js.Promise[Buffer] = js.native
  /* static member */
  @JSImport("node-zopfli", "compress")
  @js.native
  def compress(input: Buffer, format: Format, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  @JSImport("node-zopfli", "compress")
  @js.native
  def compress(input: Buffer, format: Format, options: Options): js.Promise[Buffer] = js.native
  /* static member */
  @JSImport("node-zopfli", "compress")
  @js.native
  def compress(
    input: Buffer,
    format: Format,
    options: Options,
    cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]
  ): Unit = js.native
  
  /* static member */
  @JSImport("node-zopfli", "createDeflate")
  @js.native
  def createDeflate(): Zopfli = js.native
  @JSImport("node-zopfli", "createDeflate")
  @js.native
  def createDeflate(options: Options): Zopfli = js.native
  
  /* static member */
  @JSImport("node-zopfli", "createGzip")
  @js.native
  def createGzip(): Zopfli = js.native
  @JSImport("node-zopfli", "createGzip")
  @js.native
  def createGzip(options: Options): Zopfli = js.native
  
  /* static member */
  @JSImport("node-zopfli", "createZlib")
  @js.native
  def createZlib(): Zopfli = js.native
  @JSImport("node-zopfli", "createZlib")
  @js.native
  def createZlib(options: Options): Zopfli = js.native
  
  /* static member */
  @JSImport("node-zopfli", "deflate")
  @js.native
  def deflate(input: Buffer): js.Promise[Buffer] = js.native
  /* static member */
  @JSImport("node-zopfli", "deflate")
  @js.native
  def deflate(input: Buffer, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  @JSImport("node-zopfli", "deflate")
  @js.native
  def deflate(input: Buffer, options: Options): js.Promise[Buffer] = js.native
  /* static member */
  @JSImport("node-zopfli", "deflate")
  @js.native
  def deflate(input: Buffer, options: Options, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  
  /* static member */
  @JSImport("node-zopfli", "deflateSync")
  @js.native
  def deflateSync(): Buffer = js.native
  @JSImport("node-zopfli", "deflateSync")
  @js.native
  def deflateSync(options: Options): Buffer = js.native
  
  /* static member */
  @JSImport("node-zopfli", "gzip")
  @js.native
  def gzip(input: Buffer): js.Promise[Buffer] = js.native
  /* static member */
  @JSImport("node-zopfli", "gzip")
  @js.native
  def gzip(input: Buffer, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  @JSImport("node-zopfli", "gzip")
  @js.native
  def gzip(input: Buffer, options: Options): js.Promise[Buffer] = js.native
  /* static member */
  @JSImport("node-zopfli", "gzip")
  @js.native
  def gzip(input: Buffer, options: Options, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  
  /* static member */
  @JSImport("node-zopfli", "gzipSync")
  @js.native
  def gzipSync(): Buffer = js.native
  @JSImport("node-zopfli", "gzipSync")
  @js.native
  def gzipSync(options: Options): Buffer = js.native
  
  /* static member */
  @JSImport("node-zopfli", "zlib")
  @js.native
  def zlib(input: Buffer): js.Promise[Buffer] = js.native
  /* static member */
  @JSImport("node-zopfli", "zlib")
  @js.native
  def zlib(input: Buffer, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  @JSImport("node-zopfli", "zlib")
  @js.native
  def zlib(input: Buffer, options: Options): js.Promise[Buffer] = js.native
  /* static member */
  @JSImport("node-zopfli", "zlib")
  @js.native
  def zlib(input: Buffer, options: Options, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  
  /* static member */
  @JSImport("node-zopfli", "zlibSync")
  @js.native
  def zlibSync(): Buffer = js.native
  @JSImport("node-zopfli", "zlibSync")
  @js.native
  def zlibSync(options: Options): Buffer = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeZopfli.nodeZopfliStrings.deflate
    - typingsSlinky.nodeZopfli.nodeZopfliStrings.gzip
    - typingsSlinky.nodeZopfli.nodeZopfliStrings.zlib
  */
  trait Format extends StObject
  object Format {
    
    @scala.inline
    def deflate: typingsSlinky.nodeZopfli.nodeZopfliStrings.deflate = "deflate".asInstanceOf[typingsSlinky.nodeZopfli.nodeZopfliStrings.deflate]
    
    @scala.inline
    def gzip: typingsSlinky.nodeZopfli.nodeZopfliStrings.gzip = "gzip".asInstanceOf[typingsSlinky.nodeZopfli.nodeZopfliStrings.gzip]
    
    @scala.inline
    def zlib: typingsSlinky.nodeZopfli.nodeZopfliStrings.zlib = "zlib".asInstanceOf[typingsSlinky.nodeZopfli.nodeZopfliStrings.zlib]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * If true, splits the data in multiple deflate blocks with optimal choice for the block boundaries.
      * Block splitting gives better compression.
      */
    var blocksplitting: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, chooses the optimal block split points only after doing the iterative LZ77 compression.
      * If false, chooses the block split points first, then does iterative LZ77 on each individual block.
      * Depending on the file, either first or last gives the best compression.
      */
    var blocksplittinglast: js.UndefOr[Boolean] = js.native
    
    /**
      * Maximum amount of blocks to split into (0 for unlimited,
      * but this can give extreme results that hurt compression on some files).
      */
    var blocksplittingmax: js.UndefOr[Double] = js.native
    
    /**
      * Maximum amount of times to rerun forward and backward pass to optimize LZ77 compression cost.
      * Good values: 10, 15 for small files, 5 for files over several MB in size or it will be too slow.
      */
    var numiterations: js.UndefOr[Double] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
    
    var verbose_more: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocksplitting(value: Boolean): Self = StObject.set(x, "blocksplitting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksplittingUndefined: Self = StObject.set(x, "blocksplitting", js.undefined)
      
      @scala.inline
      def setBlocksplittinglast(value: Boolean): Self = StObject.set(x, "blocksplittinglast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksplittinglastUndefined: Self = StObject.set(x, "blocksplittinglast", js.undefined)
      
      @scala.inline
      def setBlocksplittingmax(value: Double): Self = StObject.set(x, "blocksplittingmax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksplittingmaxUndefined: Self = StObject.set(x, "blocksplittingmax", js.undefined)
      
      @scala.inline
      def setNumiterations(value: Double): Self = StObject.set(x, "numiterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumiterationsUndefined: Self = StObject.set(x, "numiterations", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setVerbose_more(value: Boolean): Self = StObject.set(x, "verbose_more", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose_moreUndefined: Self = StObject.set(x, "verbose_more", js.undefined)
    }
  }
  
  type Zopfli = Transform
}
