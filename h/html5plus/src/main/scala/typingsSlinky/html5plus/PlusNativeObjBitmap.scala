package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 原生图片对象
  * 原生图片对象会占用较大的内存资源，在使用时需谨慎管理，当图片不再使用时应该及时调用clear方法进行销毁。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjBitmap extends StObject {
  
  /**
    * 销毁Bitmap图片
    * 释放Bitmap图片占用的内存资源，销毁后图片对象将不可使用，其id属性值为undefined，调用其所有方法操作都会失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def clear(): Unit = js.native
  
  /**
    * 静态方法，获取指定标识的Bitmap图片对象
    * 在应用中已创建的图片对象中查找指定标识的Bitmap对象并返回。
    *     若存在多个相同标识的Bitmap图片，则返回第一个创建的Bitmap图片。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def getBitmapById(): PlusNativeObjBitmap = js.native
  def getBitmapById(id: String): PlusNativeObjBitmap = js.native
  
  /**
    * 静态方法，获取所有Bitmap图片对象
    * 获取应用运行期创建的所有Bitmap图片对象，包含所有空Bitmap对象，不包含已经销毁的Bitmap对象。返回的Bitmap对象在数组中按创建的属性排列，及数组中第一个是最先创建的Bitmap对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def getItems(): js.Array[PlusNativeObj] = js.native
  
  /**
    * Bitmap对象的标识
    * 在创建Bitmap对象时设置，如果没有设置标识，此属性值为null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 加载Bitmap图片
    * 从指定的路径（仅支持本地文件系统）中加载图片，此操作将覆盖之前的图片内容，
    *     如果加载图片失败则保留之前的图片内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def load(): Unit = js.native
  def load(
    path: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def load(path: js.UndefOr[scala.Nothing], successCallback: js.Function0[Unit]): Unit = js.native
  def load(
    path: js.UndefOr[scala.Nothing],
    successCallback: js.Function0[Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def load(path: String): Unit = js.native
  def load(
    path: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def load(path: String, successCallback: js.Function0[Unit]): Unit = js.native
  def load(
    path: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 加载Base64编码格式图片到Bitmap对象
    * 从Base64编码格式图片数据中加载图片，此操作将覆盖之前的图片内容，
    *     如果加载图片失败则保留之前的图片内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def loadBase64Data(): Unit = js.native
  def loadBase64Data(
    data: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def loadBase64Data(data: js.UndefOr[scala.Nothing], successCallback: js.Function0[Unit]): Unit = js.native
  def loadBase64Data(
    data: js.UndefOr[scala.Nothing],
    successCallback: js.Function0[Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def loadBase64Data(data: String): Unit = js.native
  def loadBase64Data(
    data: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def loadBase64Data(data: String, successCallback: js.Function0[Unit]): Unit = js.native
  def loadBase64Data(
    data: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 回收Bitmap图片内存
    * 释放Bitmap图片占用的内存资源，但不销毁图片对象，依然可以继续使用图片对象。
    *     当图片对象再次被使用时会自动从设置的路径（构造函数或load/save方法设置）加载到内存中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def recycle(): Unit = js.native
  
  /**
    * 保存图片
    * 将图片保存到指定的路径（仅支持本地文件系统），如果图片为空或者指定的路径文件已经存在则返回失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def save(): Unit = js.native
  def save(
    path: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def save(
    path: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def save(
    path: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def save(path: js.UndefOr[scala.Nothing], options: PlusNativeObjBitmapSaveOptions): Unit = js.native
  def save(
    path: js.UndefOr[scala.Nothing],
    options: PlusNativeObjBitmapSaveOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def save(
    path: js.UndefOr[scala.Nothing],
    options: PlusNativeObjBitmapSaveOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def save(
    path: js.UndefOr[scala.Nothing],
    options: PlusNativeObjBitmapSaveOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def save(path: String): Unit = js.native
  def save(
    path: String,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def save(
    path: String,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def save(
    path: String,
    options: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def save(path: String, options: PlusNativeObjBitmapSaveOptions): Unit = js.native
  def save(
    path: String,
    options: PlusNativeObjBitmapSaveOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def save(
    path: String,
    options: PlusNativeObjBitmapSaveOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def save(
    path: String,
    options: PlusNativeObjBitmapSaveOptions,
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 获取图片的Base64编码数据
    * 读取图片的数据内容，并转换为Base64编码格式字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def toBase64Data(): String = js.native
}
