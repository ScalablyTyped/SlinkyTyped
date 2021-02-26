package typingsSlinky.reactNativeFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def CachesDirectoryPath: java.lang.String = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CachesDirectoryPath").asInstanceOf[java.lang.String]
  
  @scala.inline
  def DocumentDirectoryPath: java.lang.String = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DocumentDirectoryPath").asInstanceOf[java.lang.String]
  
  @scala.inline
  def DownloadDirectoryPath: java.lang.String = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DownloadDirectoryPath").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ExternalCachesDirectoryPath: java.lang.String = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ExternalCachesDirectoryPath").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ExternalDirectoryPath: java.lang.String = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ExternalDirectoryPath").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ExternalStorageDirectoryPath: java.lang.String = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ExternalStorageDirectoryPath").asInstanceOf[java.lang.String]
  
  type Fields = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  @scala.inline
  def FileProtectionKeys: java.lang.String = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("FileProtectionKeys").asInstanceOf[java.lang.String]
  
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  @scala.inline
  def LibraryDirectoryPath: java.lang.String = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("LibraryDirectoryPath").asInstanceOf[java.lang.String]
  
  @scala.inline
  def MainBundlePath: java.lang.String = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MainBundlePath").asInstanceOf[java.lang.String]
  
  @scala.inline
  def PicturesDirectoryPath: java.lang.String = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PicturesDirectoryPath").asInstanceOf[java.lang.String]
  
  @scala.inline
  def TemporaryDirectoryPath: java.lang.String = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TemporaryDirectoryPath").asInstanceOf[java.lang.String]
  
  @scala.inline
  def appendFile(filepath: java.lang.String, contents: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def appendFile(filepath: java.lang.String, contents: java.lang.String, encodingOrOptions: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def completeHandlerIOS(jobId: scala.Double): scala.Unit = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("completeHandlerIOS")(jobId.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def copyAssetsFileIOS(imageUri: java.lang.String, destPath: java.lang.String, width: scala.Double, height: scala.Double): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def copyAssetsFileIOS(
    imageUri: java.lang.String,
    destPath: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    scale: js.UndefOr[scala.Nothing],
    compression: js.UndefOr[scala.Nothing],
    resizeMode: java.lang.String
  ): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], compression.asInstanceOf[js.Any], resizeMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def copyAssetsFileIOS(
    imageUri: java.lang.String,
    destPath: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    scale: js.UndefOr[scala.Nothing],
    compression: scala.Double
  ): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], compression.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def copyAssetsFileIOS(
    imageUri: java.lang.String,
    destPath: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    scale: js.UndefOr[scala.Nothing],
    compression: scala.Double,
    resizeMode: java.lang.String
  ): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], compression.asInstanceOf[js.Any], resizeMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def copyAssetsFileIOS(
    imageUri: java.lang.String,
    destPath: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    scale: scala.Double
  ): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def copyAssetsFileIOS(
    imageUri: java.lang.String,
    destPath: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    scale: scala.Double,
    compression: js.UndefOr[scala.Nothing],
    resizeMode: java.lang.String
  ): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], compression.asInstanceOf[js.Any], resizeMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def copyAssetsFileIOS(
    imageUri: java.lang.String,
    destPath: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    scale: scala.Double,
    compression: scala.Double
  ): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], compression.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def copyAssetsFileIOS(
    imageUri: java.lang.String,
    destPath: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    scale: scala.Double,
    compression: scala.Double,
    resizeMode: java.lang.String
  ): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], compression.asInstanceOf[js.Any], resizeMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def copyAssetsVideoIOS(imageUri: java.lang.String, destPath: java.lang.String): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsVideoIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def copyFile(filepath: java.lang.String, destPath: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(filepath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def copyFile(
    filepath: java.lang.String,
    destPath: java.lang.String,
    options: typingsSlinky.reactNativeFs.mod.FileOptions
  ): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(filepath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def copyFileAssets(filepath: java.lang.String, destPath: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFileAssets")(filepath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def copyFileRes(filepath: java.lang.String, destPath: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFileRes")(filepath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def downloadFile(options: typingsSlinky.reactNativeFs.mod.DownloadFileOptions): typingsSlinky.reactNativeFs.anon.JobId = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeFs.anon.JobId]
  
  @scala.inline
  def exists(filepath: java.lang.String): js.Promise[scala.Boolean] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exists")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Boolean]]
  
  @scala.inline
  def existsAssets(filepath: java.lang.String): js.Promise[scala.Boolean] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("existsAssets")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Boolean]]
  
  @scala.inline
  def existsRes(filepath: java.lang.String): js.Promise[scala.Boolean] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("existsRes")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Boolean]]
  
  @scala.inline
  def getAllExternalFilesDirs(): js.Promise[js.Array[java.lang.String]] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getAllExternalFilesDirs")().asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  @scala.inline
  def getFSInfo(): js.Promise[typingsSlinky.reactNativeFs.mod.FSInfoResult] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getFSInfo")().asInstanceOf[js.Promise[typingsSlinky.reactNativeFs.mod.FSInfoResult]]
  
  @scala.inline
  def hash(filepath: java.lang.String, algorithm: java.lang.String): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hash")(filepath.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def isResumable(jobId: scala.Double): js.Promise[scala.Boolean] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isResumable")(jobId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Boolean]]
  
  @scala.inline
  def mkdir(filepath: java.lang.String): js.Promise[scala.Unit] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def mkdir(filepath: java.lang.String, options: typingsSlinky.reactNativeFs.mod.MkdirOptions): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def moveFile(filepath: java.lang.String, destPath: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveFile")(filepath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def moveFile(
    filepath: java.lang.String,
    destPath: java.lang.String,
    options: typingsSlinky.reactNativeFs.mod.FileOptions
  ): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveFile")(filepath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def pathForBundle(bundleNamed: java.lang.String): js.Promise[java.lang.String] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pathForBundle")(bundleNamed.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def pathForGroup(groupName: java.lang.String): js.Promise[java.lang.String] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pathForGroup")(groupName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def read(filepath: java.lang.String): js.Promise[java.lang.String] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def read(
    filepath: java.lang.String,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    encodingOrOptions: js.Any
  ): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def read(filepath: java.lang.String, length: js.UndefOr[scala.Nothing], position: scala.Double): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def read(
    filepath: java.lang.String,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    encodingOrOptions: js.Any
  ): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def read(filepath: java.lang.String, length: scala.Double): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def read(
    filepath: java.lang.String,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    encodingOrOptions: js.Any
  ): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def read(filepath: java.lang.String, length: scala.Double, position: scala.Double): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def read(
    filepath: java.lang.String,
    length: scala.Double,
    position: scala.Double,
    encodingOrOptions: js.Any
  ): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def readDirAssets(dirpath: java.lang.String): js.Promise[js.Array[typingsSlinky.reactNativeFs.mod.ReadDirItem]] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readDirAssets")(dirpath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsSlinky.reactNativeFs.mod.ReadDirItem]]]
  
  @scala.inline
  def readDir_(dirpath: java.lang.String): js.Promise[js.Array[typingsSlinky.reactNativeFs.mod.ReadDirItem]] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readDir")(dirpath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsSlinky.reactNativeFs.mod.ReadDirItem]]]
  
  @scala.inline
  def readFile(filepath: java.lang.String): js.Promise[java.lang.String] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readFile(filepath: java.lang.String, encodingOrOptions: js.Any): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filepath.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def readFileAssets(filepath: java.lang.String): js.Promise[java.lang.String] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileAssets")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readFileAssets(filepath: java.lang.String, encodingOrOptions: js.Any): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileAssets")(filepath.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def readFileRes(filepath: java.lang.String): js.Promise[java.lang.String] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileRes")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readFileRes(filepath: java.lang.String, encodingOrOptions: js.Any): js.Promise[java.lang.String] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileRes")(filepath.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def readdir(dirpath: java.lang.String): js.Promise[js.Array[java.lang.String]] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(dirpath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  @scala.inline
  def resumeDownload(jobId: scala.Double): scala.Unit = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resumeDownload")(jobId.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def scanFile(path: java.lang.String): js.Promise[js.Array[java.lang.String]] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("scanFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  @scala.inline
  def setReadable(filepath: java.lang.String, readable: scala.Boolean, ownerOnly: scala.Boolean): js.Promise[scala.Boolean] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setReadable")(filepath.asInstanceOf[js.Any], readable.asInstanceOf[js.Any], ownerOnly.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Boolean]]
  
  @scala.inline
  def stat(filepath: java.lang.String): js.Promise[typingsSlinky.reactNativeFs.mod.StatResult] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.reactNativeFs.mod.StatResult]]
  
  @scala.inline
  def stopDownload(jobId: scala.Double): scala.Unit = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stopDownload")(jobId.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def stopUpload(jobId: scala.Double): scala.Unit = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stopUpload")(jobId.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def touch(filepath: java.lang.String): js.Promise[scala.Unit] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("touch")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def touch(filepath: java.lang.String, mtime: js.UndefOr[scala.Nothing], ctime: js.Date): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("touch")(filepath.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], ctime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def touch(filepath: java.lang.String, mtime: js.Date): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("touch")(filepath.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def touch(filepath: java.lang.String, mtime: js.Date, ctime: js.Date): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("touch")(filepath.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], ctime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def unlink(filepath: java.lang.String): js.Promise[scala.Unit] = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def uploadFiles(options: typingsSlinky.reactNativeFs.mod.UploadFileOptions): typingsSlinky.reactNativeFs.anon.Promise = typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("uploadFiles")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeFs.anon.Promise]
  
  @scala.inline
  def write(filepath: java.lang.String, contents: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def write(
    filepath: java.lang.String,
    contents: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encodingOrOptions: js.Any
  ): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def write(filepath: java.lang.String, contents: java.lang.String, position: scala.Double): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def write(
    filepath: java.lang.String,
    contents: java.lang.String,
    position: scala.Double,
    encodingOrOptions: js.Any
  ): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def writeFile(filepath: java.lang.String, contents: java.lang.String): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def writeFile(filepath: java.lang.String, contents: java.lang.String, encodingOrOptions: js.Any): js.Promise[scala.Unit] = (typingsSlinky.reactNativeFs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
}
