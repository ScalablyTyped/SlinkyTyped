organization := "org.scalablytyped.slinky"
name := "npm-profile"
version := "5.0-dt-20200908Z-854dd1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "form-data" % "3.0.0-ee7e6b",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "node-fetch" % "2.5-dt-20200515Z-65e944",
  "org.scalablytyped.slinky" %%% "npm-package-arg" % "6.1-dt-20200515Z-ae3527",
  "org.scalablytyped.slinky" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-3e753f",
  "org.scalablytyped.slinky" %%% "npmlog" % "4.1-dt-20190626Z-651a92",
  "org.scalablytyped.slinky" %%% "ssri" % "7.1-dt-20200620Z-0ee45c",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
