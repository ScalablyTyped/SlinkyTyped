package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemManager extends StObject {
  
  /** [FileSystemManager.access(Object object)](FileSystemManager.access.md)
    *
    * 判断文件/目录是否存在 */
  def access(option: AccessOption): Unit = js.native
  
  /** [FileSystemManager.accessSync(string path)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.accessSync.html)
    *
    * [FileSystemManager.access](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.access.html) 的同步版本 */
  def accessSync(/** 要判断是否存在的文件/目录路径 */
  path: String): Unit = js.native
  
  /** [FileSystemManager.appendFile(Object object)](FileSystemManager.appendFile.md)
    *
    * 在文件结尾追加内容
    *
    * 最低基础库： `2.1.0` */
  def appendFile(option: AppendFileOption): Unit = js.native
  
  /** [FileSystemManager.appendFileSync(string filePath, string|ArrayBuffer data, string encoding)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.appendFileSync.html)
    *
    * [FileSystemManager.appendFile](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.appendFile.html) 的同步版本
    *
    * 最低基础库： `2.1.0` */
  def appendFileSync(/** 要追加内容的文件路径 */
  filePath: String, /** 要追加的文本或二进制数据 */
  data: String): Unit = js.native
  def appendFileSync(
    /** 要追加内容的文件路径 */
  filePath: String,
    /** 要追加的文本或二进制数据 */
  data: String,
    /** 指定写入文件的字符编码 */
  encoding: String
  ): Unit = js.native
  def appendFileSync(/** 要追加内容的文件路径 */
  filePath: String, /** 要追加的文本或二进制数据 */
  data: ArrayBuffer): Unit = js.native
  def appendFileSync(
    /** 要追加内容的文件路径 */
  filePath: String,
    /** 要追加的文本或二进制数据 */
  data: ArrayBuffer,
    /** 指定写入文件的字符编码 */
  encoding: String
  ): Unit = js.native
  
  /** [FileSystemManager.copyFile(Object object)](FileSystemManager.copyFile.md)
    *
    * 复制文件 */
  def copyFile(option: CopyFileOption): Unit = js.native
  
  /** [FileSystemManager.copyFileSync(string srcPath, string destPath)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.copyFileSync.html)
    *
    * [FileSystemManager.copyFile](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.copyFile.html) 的同步版本 */
  def copyFileSync(/** 源文件路径，只可以是普通文件 */
  srcPath: String, /** 目标文件路径 */
  destPath: String): Unit = js.native
  
  /** [FileSystemManager.getFileInfo(Object object)](FileSystemManager.getFileInfo.md)
    *
    * 获取该小程序下的 本地临时文件 或 本地缓存文件 信息 */
  def getFileInfo(option: FileSystemManagerGetFileInfoOption): Unit = js.native
  
  /** [FileSystemManager.getSavedFileList(Object object)](FileSystemManager.getSavedFileList.md)
    *
    * 获取该小程序下已保存的本地缓存文件列表 */
  def getSavedFileList(): Unit = js.native
  def getSavedFileList(option: FileSystemManagerGetSavedFileListOption): Unit = js.native
  
  /** [FileSystemManager.mkdir(Object object)](FileSystemManager.mkdir.md)
    *
    * 创建目录 */
  def mkdir(option: MkdirOption): Unit = js.native
  
  /** [FileSystemManager.mkdirSync(string dirPath, boolean recursive)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.mkdirSync.html)
    *
    * [FileSystemManager.mkdir](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.mkdir.html) 的同步版本 */
  def mkdirSync(/** 创建的目录路径 */
  dirPath: String): Unit = js.native
  def mkdirSync(
    /** 创建的目录路径 */
  dirPath: String,
    /** 是否在递归创建该目录的上级目录后再创建该目录。如果对应的上级目录已经存在，则不创建该上级目录。如 dirPath 为 a/b/c/d 且 recursive 为 true，将创建 a 目录，再在 a 目录下创建 b 目录，以此类推直至创建 a/b/c 目录下的 d 目录。
    *
    * 最低基础库： `2.3.0` */
  recursive: Boolean
  ): Unit = js.native
  
  /** [FileSystemManager.readFile(Object object)](FileSystemManager.readFile.md)
    *
    * 读取本地文件内容 */
  def readFile(option: ReadFileOption): Unit = js.native
  
  /** [string|ArrayBuffer FileSystemManager.readFileSync(string filePath, string encoding)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.readFileSync.html)
    *
    * [FileSystemManager.readFile](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.readFile.html) 的同步版本 */
  def readFileSync(/** 要读取的文件的路径 */
  filePath: String): String = js.native
  def readFileSync(
    /** 要读取的文件的路径 */
  filePath: String,
    /** 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容 */
  encoding: String
  ): String = js.native
  
  /** [FileSystemManager.readdir(Object object)](FileSystemManager.readdir.md)
    *
    * 读取目录内文件列表 */
  def readdir(option: ReaddirOption): Unit = js.native
  
  /** [Array.<string> FileSystemManager.readdirSync(string dirPath)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.readdirSync.html)
    *
    * [FileSystemManager.readdir](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.readdir.html) 的同步版本 */
  def readdirSync(/** 要读取的目录路径 */
  dirPath: String): Array[String] = js.native
  
  /** [FileSystemManager.removeSavedFile(Object object)](FileSystemManager.removeSavedFile.md)
    *
    * 删除该小程序下已保存的本地缓存文件 */
  def removeSavedFile(option: FileSystemManagerRemoveSavedFileOption): Unit = js.native
  
  /** [FileSystemManager.rename(Object object)](FileSystemManager.rename.md)
    *
    * 重命名文件。可以把文件从 oldPath 移动到 newPath */
  def rename(option: RenameOption): Unit = js.native
  
  /** [FileSystemManager.renameSync(string oldPath, string newPath)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.renameSync.html)
    *
    * [FileSystemManager.rename](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.rename.html) 的同步版本 */
  def renameSync(/** 源文件路径，可以是普通文件或目录 */
  oldPath: String, /** 新文件路径 */
  newPath: String): Unit = js.native
  
  /** [FileSystemManager.rmdir(Object object)](FileSystemManager.rmdir.md)
    *
    * 删除目录 */
  def rmdir(option: RmdirOption): Unit = js.native
  
  /** [FileSystemManager.rmdirSync(string dirPath, boolean recursive)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.rmdirSync.html)
    *
    * [FileSystemManager.rmdir](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.rmdir.html) 的同步版本 */
  def rmdirSync(/** 要删除的目录路径 */
  dirPath: String): Unit = js.native
  def rmdirSync(
    /** 要删除的目录路径 */
  dirPath: String,
    /** 是否递归删除目录。如果为 true，则删除该目录和该目录下的所有子目录以及文件。
    *
    * 最低基础库： `2.3.0` */
  recursive: Boolean
  ): Unit = js.native
  
  /** [FileSystemManager.saveFile(Object object)](FileSystemManager.saveFile.md)
    *
    * 保存临时文件到本地。此接口会移动临时文件，因此调用成功后，tempFilePath 将不可用。 */
  def saveFile(option: FileSystemManagerSaveFileOption): Unit = js.native
  
  /** [number FileSystemManager.saveFileSync(string tempFilePath, string filePath)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.saveFileSync.html)
    *
    * [FileSystemManager.saveFile](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.saveFile.html) 的同步版本 */
  def saveFileSync(/** 临时存储文件路径 */
  tempFilePath: String): Double = js.native
  def saveFileSync(/** 临时存储文件路径 */
  tempFilePath: String, /** 要存储的文件路径 */
  filePath: String): Double = js.native
  
  /** [FileSystemManager.stat(Object object)](FileSystemManager.stat.md)
    *
    * 获取文件 Stats 对象 */
  def stat(option: StatOption): Unit = js.native
  
  /** [[Stats](https://developers.weixin.qq.com/miniprogram/dev/api/file/Stats.html)|Object FileSystemManager.statSync(string path, boolean recursive)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.statSync.html)
    *
    * [FileSystemManager.stat](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.stat.html) 的同步版本 */
  def statSync(/** 文件/目录路径 */
  path: String): Stats = js.native
  def statSync(
    /** 文件/目录路径 */
  path: String,
    /** 是否递归获取目录下的每个文件的 Stats 信息
    *
    * 最低基础库： `2.3.0` */
  recursive: Boolean
  ): Stats = js.native
  
  /** [FileSystemManager.unlink(Object object)](FileSystemManager.unlink.md)
    *
    * 删除文件 */
  def unlink(option: UnlinkOption): Unit = js.native
  
  /** [FileSystemManager.unlinkSync(string filePath)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.unlinkSync.html)
    *
    * [FileSystemManager.unlink](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.unlink.html) 的同步版本 */
  def unlinkSync(/** 要删除的文件路径 */
  filePath: String): Unit = js.native
  
  /** [FileSystemManager.unzip(Object object)](FileSystemManager.unzip.md)
    *
    * 解压文件 */
  def unzip(option: UnzipOption): Unit = js.native
  
  /** [FileSystemManager.writeFile(Object object)](FileSystemManager.writeFile.md)
    *
    * 写文件 */
  def writeFile(option: WriteFileOption): Unit = js.native
  
  /** [FileSystemManager.writeFileSync(string filePath, string|ArrayBuffer data, string encoding)](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.writeFileSync.html)
    *
    * [FileSystemManager.writeFile](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.writeFile.html) 的同步版本 */
  def writeFileSync(/** 要写入的文件路径 */
  filePath: String, /** 要写入的文本或二进制数据 */
  data: String): Unit = js.native
  def writeFileSync(
    /** 要写入的文件路径 */
  filePath: String,
    /** 要写入的文本或二进制数据 */
  data: String,
    /** 指定写入文件的字符编码 */
  encoding: String
  ): Unit = js.native
  def writeFileSync(/** 要写入的文件路径 */
  filePath: String, /** 要写入的文本或二进制数据 */
  data: ArrayBuffer): Unit = js.native
  def writeFileSync(
    /** 要写入的文件路径 */
  filePath: String,
    /** 要写入的文本或二进制数据 */
  data: ArrayBuffer,
    /** 指定写入文件的字符编码 */
  encoding: String
  ): Unit = js.native
}
