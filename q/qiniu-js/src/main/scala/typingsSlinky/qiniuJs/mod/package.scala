package typingsSlinky.qiniuJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  @scala.inline
  def compressImage(file: org.scalajs.dom.raw.Blob, options: typingsSlinky.qiniuJs.anon.PartialCompressOptions): js.Promise[typingsSlinky.qiniuJs.anon.Dist] = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compressImage")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.qiniuJs.anon.Dist]]
  
  @scala.inline
  def createMkFileUrl(
    url: java.lang.String,
    size: scala.Double,
    key: java.lang.String,
    putExtra: typingsSlinky.qiniuJs.anon.PartialExtra
  ): java.lang.String = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMkFileUrl")(url.asInstanceOf[js.Any], size.asInstanceOf[js.Any], key.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def exif(key: java.lang.String, domain: java.lang.String): js.Promise[typingsSlinky.qiniuJs.mod.ExtentInfo] = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exif")(key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.qiniuJs.mod.ExtentInfo]]
  
  @scala.inline
  def filterParams(params: js.Any): js.Array[js.Tuple2[java.lang.String, _]] = typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("filterParams")(params.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[java.lang.String, _]]]
  
  @scala.inline
  def getHeadersForChunkUpload(token: java.lang.String): typingsSlinky.qiniuJs.mod.Headers = typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersForChunkUpload")(token.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.qiniuJs.mod.Headers]
  
  @scala.inline
  def getHeadersForMkFile(token: java.lang.String): typingsSlinky.qiniuJs.mod.Headers = typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersForMkFile")(token.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.qiniuJs.mod.Headers]
  
  @scala.inline
  def getUploadUrl(config: typingsSlinky.qiniuJs.anon.PartialConfig, token: java.lang.String): js.Promise[java.lang.String] = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getUploadUrl")(config.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def imageInfo(key: java.lang.String, domain: java.lang.String): js.Promise[typingsSlinky.qiniuJs.mod.ImageInfo_] = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageInfo")(key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.qiniuJs.mod.ImageInfo_]]
  
  @scala.inline
  def imageMogr2(
    optoins: typingsSlinky.qiniuJs.anon.PartialImageMogr2Options,
    key: java.lang.String,
    domain: java.lang.String
  ): java.lang.String = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageMogr2")(optoins.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def imageView2(
    options: typingsSlinky.qiniuJs.anon.PartialImageView2Options,
    key: java.lang.String,
    domain: java.lang.String
  ): java.lang.String = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageView2")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def pipeline(
    fos: js.Array[
      typingsSlinky.qiniuJs.mod.WaterMarkFopOptions1 | typingsSlinky.qiniuJs.mod.WaterMarkFopOptions2 | typingsSlinky.qiniuJs.mod.ImageView2FopOptions | typingsSlinky.qiniuJs.mod.ImageMogr2FopOptions
    ],
    key: java.lang.String,
    domain: java.lang.String
  ): java.lang.String = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(fos.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def upload(
    file: org.scalajs.dom.raw.Blob,
    key: js.UndefOr[scala.Nothing],
    token: java.lang.String,
    putExtra: typingsSlinky.qiniuJs.anon.PartialExtra,
    config: typingsSlinky.qiniuJs.anon.PartialConfig
  ): typingsSlinky.qiniuJs.mod.Observable = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.qiniuJs.mod.Observable]
  @scala.inline
  def upload(
    file: org.scalajs.dom.raw.Blob,
    key: java.lang.String,
    token: java.lang.String,
    putExtra: typingsSlinky.qiniuJs.anon.PartialExtra,
    config: typingsSlinky.qiniuJs.anon.PartialConfig
  ): typingsSlinky.qiniuJs.mod.Observable = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.qiniuJs.mod.Observable]
  @scala.inline
  def upload(
    file: org.scalajs.dom.raw.Blob,
    key: scala.Null,
    token: java.lang.String,
    putExtra: typingsSlinky.qiniuJs.anon.PartialExtra,
    config: typingsSlinky.qiniuJs.anon.PartialConfig
  ): typingsSlinky.qiniuJs.mod.Observable = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.qiniuJs.mod.Observable]
  
  @scala.inline
  def watermark(options: typingsSlinky.qiniuJs.mod.WaterMarkOptions1): java.lang.String = typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def watermark(
    options: typingsSlinky.qiniuJs.mod.WaterMarkOptions1,
    key: js.UndefOr[scala.Nothing],
    domain: java.lang.String
  ): java.lang.String = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def watermark(options: typingsSlinky.qiniuJs.mod.WaterMarkOptions1, key: java.lang.String): java.lang.String = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def watermark(
    options: typingsSlinky.qiniuJs.mod.WaterMarkOptions1,
    key: java.lang.String,
    domain: java.lang.String
  ): java.lang.String = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def watermark(options: typingsSlinky.qiniuJs.mod.WaterMarkOptions2): java.lang.String = typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def watermark(
    options: typingsSlinky.qiniuJs.mod.WaterMarkOptions2,
    key: js.UndefOr[scala.Nothing],
    domain: java.lang.String
  ): java.lang.String = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def watermark(options: typingsSlinky.qiniuJs.mod.WaterMarkOptions2, key: java.lang.String): java.lang.String = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def watermark(
    options: typingsSlinky.qiniuJs.mod.WaterMarkOptions2,
    key: java.lang.String,
    domain: java.lang.String
  ): java.lang.String = (typingsSlinky.qiniuJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
