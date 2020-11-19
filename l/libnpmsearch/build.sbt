organization := "org.scalablytyped.slinky"
name := "libnpmsearch"
version := "2.0-dt-20190926Z-ec76cc"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "form-data" % "3.0.0-5f101b",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "node-fetch" % "2.5-dt-20200515Z-e73f4e",
  "org.scalablytyped.slinky" %%% "npm-package-arg" % "6.1-dt-20200515Z-ae3527",
  "org.scalablytyped.slinky" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-6cef32",
  "org.scalablytyped.slinky" %%% "npmlog" % "4.1-dt-20190626Z-160ba8",
  "org.scalablytyped.slinky" %%% "ssri" % "7.1-dt-20200620Z-41fc82",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
