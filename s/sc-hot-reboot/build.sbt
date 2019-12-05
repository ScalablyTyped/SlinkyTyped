organization := "org.scalablytyped.slinky"
name := "sc-hot-reboot"
version := "1.0-dt-20190224Z-4541fb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.3.0-e88e44",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.3-dt-20191015Z-506ae8",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20181130Z-119fd9",
  "org.scalablytyped.slinky" %%% "socketcluster" % "14.0-dt-20191126Z-3f3b8c",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        