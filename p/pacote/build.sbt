organization := "org.scalablytyped.slinky"
name := "pacote"
version := "9.5-dt-20191126Z-c9fd1a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "node-fetch" % "2.5-dt-20191126Z-604ea6",
  "org.scalablytyped.slinky" %%% "npm-package-arg" % "6.1-dt-20181031Z-a2a9c8",
  "org.scalablytyped.slinky" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-300a76",
  "org.scalablytyped.slinky" %%% "npmlog" % "4.1-dt-20190626Z-8f4056",
  "org.scalablytyped.slinky" %%% "ssri" % "6.0-dt-20190422Z-7bece6",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        