package typingsSlinky.compressionWebpackPlugin

import typingsSlinky.compressionWebpackPlugin.mod.ZlibAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compressionWebpackPluginStrings {
  
  @scala.inline
  def brotliCompress: brotliCompress = "brotliCompress".asInstanceOf[brotliCompress]
  
  @scala.inline
  def deflate: deflate = "deflate".asInstanceOf[deflate]
  
  @scala.inline
  def deflateRaw: deflateRaw = "deflateRaw".asInstanceOf[deflateRaw]
  
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
  
  @js.native
  sealed trait brotliCompress extends ZlibAlgorithm
  
  @js.native
  sealed trait deflate extends ZlibAlgorithm
  
  @js.native
  sealed trait deflateRaw extends ZlibAlgorithm
  
  @js.native
  sealed trait gzip extends ZlibAlgorithm
}
